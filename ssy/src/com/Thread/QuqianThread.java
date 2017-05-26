package com.Thread;

public class QuqianThread implements Runnable{
	private Quqian qq;
	private int money;
	public QuqianThread(Quqian qq,int money){
		this.qq = qq;
		this.money = money;
	}
	public void run(){
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		//同步代码块 锁住对象
		synchronized(qq){
			if(qq.getNumber()>=money){//账户余额足够
				qq.setNumber(qq.getNumber()-money);
				System.out.println("取钱2000$: "+"取钱成功，取走"+money+"$, 余额:"+qq.getNumber()+"$");
			}else{
				System.out.println("取钱3000$: "+"余额不足,当前余额:"+qq.getNumber()+"$"+" 差"+(money-qq.getNumber())+"$");
			}
		}
	}
}
