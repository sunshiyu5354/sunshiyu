package com.Thread;

public class Main {
	static int piao = 50;
	public static void main(String args[]){
		
		/*MyThread mt = new MyThread();//�����߳�
		mt.start();//�����߳�
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		MyRunnable mr = new MyRunnable();
		new Thread((Runnable) mr).start();
		for(int i = 0;i<10000;i++){
			System.out.println("�������߳�"+i);
		}*/
		Chuangkou ck1 = new Chuangkou(piao,"����һ");
		Chuangkou ck2 = new Chuangkou(piao,"���ڶ�");
		Chuangkou ck3 = new Chuangkou(piao,"������");
		
		ChuangkouThread ckT1 = new ChuangkouThread(ck1);
		ChuangkouThread ckT2 = new ChuangkouThread(ck2);
		ChuangkouThread ckT3 = new ChuangkouThread(ck3);
		
		ckT1.start();
		ckT2.start();
		ckT3.start();
	}
}