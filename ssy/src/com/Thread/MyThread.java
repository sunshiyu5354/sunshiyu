package com.Thread;

public class MyThread extends Thread{
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
				System.out.println("�������߳�"+System.currentTimeMillis());
			}catch(Exception e){		
			}
		}	
	}
}
