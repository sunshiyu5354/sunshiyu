package com.Thread;

public class Main {
	static int piao = 50;
	public static void main(String args[]){
		
		/*MyThread mt = new MyThread();//创建线程
		mt.start();//启动线程
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		MyRunnable mr = new MyRunnable();
		new Thread((Runnable) mr).start();
		for(int i = 0;i<10000;i++){
			System.out.println("我是主线程"+i);
		}*/
		Chuangkou ck1 = new Chuangkou(piao,"窗口一");
		Chuangkou ck2 = new Chuangkou(piao,"窗口二");
		Chuangkou ck3 = new Chuangkou(piao,"窗口三");
		
		ChuangkouThread ckT1 = new ChuangkouThread(ck1);
		ChuangkouThread ckT2 = new ChuangkouThread(ck2);
		ChuangkouThread ckT3 = new ChuangkouThread(ck3);
		
		ckT1.start();
		ckT2.start();
		ckT3.start();
	}
}
