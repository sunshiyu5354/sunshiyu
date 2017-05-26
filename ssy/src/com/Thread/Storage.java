package com.Thread;

public class Storage {
	private final static int MAX_SIZE = 100;
	private int size = 100;
	public Storage(int size){
		this.size = size;
	}
	
	//���
	public synchronized void push(int number){
		if(getSize()+number<=MAX_SIZE){
			setSize(getSize()+number);
			System.out.println("������:"+number+"��ǰ���Ϊ:"+getSize());
		}else{
			System.out.println("�����������ͣ�������ȴ�����������:"+getSize()+"��");
			try{
				this.wait();//�����ȡ�ö��������̴߳��ڵȴ�״̬
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		notifyAll();//֪ͨ����������
	}
	
	
	//ȡ��
	public synchronized void pop(int number){
		if(getSize()-number<0){
			try{
				this.wait();//�����ȡ�ö��������̴߳��ڵȴ�״̬
			}catch(Exception e){
				e.printStackTrace();
			}
		}else{
			setSize(getSize()-number);
			System.out.println("���ѳɹ�"+number+"������ǰʣ��:"+getSize()+"��");
		}
		notifyAll();//֪ͨ����������
	}
	public int getSize(){
		return size;
	}
	public void setSize(int size){
		this.size = size;
	}
}