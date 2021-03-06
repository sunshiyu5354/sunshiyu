package com.Thread;

public class Storage {
	private final static int MAX_SIZE = 100;
	private int size = 100;
	public Storage(int size){
		this.size = size;
	}
	
	//存货
	public synchronized void push(int number){
		if(getSize()+number<=MAX_SIZE){
			setSize(getSize()+number);
			System.out.println("生产了:"+number+"当前库存为:"+getSize());
		}else{
			System.out.println("库存已满，暂停生产，等待消费者消费:"+getSize()+"部");
			try{
				this.wait();//让想获取该对象锁的线程处于等待状态
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		notifyAll();//通知消费者消费
	}
	
	
	//取货
	public synchronized void pop(int number){
		if(getSize()-number<0){
			try{
				this.wait();//让想获取该对象锁的线程处于等待状态
			}catch(Exception e){
				e.printStackTrace();
			}
		}else{
			setSize(getSize()-number);
			System.out.println("消费成功"+number+"部，当前剩余:"+getSize()+"部");
		}
		notifyAll();//通知生产者生产
	}
	public int getSize(){
		return size;
	}
	public void setSize(int size){
		this.size = size;
	}
}
