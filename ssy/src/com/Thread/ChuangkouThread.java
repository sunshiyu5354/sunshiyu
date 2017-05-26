package com.Thread;

public class ChuangkouThread extends Thread{
	Chuangkou ck;
	public ChuangkouThread(Chuangkou ck){
		this.ck = ck;
	}
	public void run(){
		ck.sale();
	}
}
