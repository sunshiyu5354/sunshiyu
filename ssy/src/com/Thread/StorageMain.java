package com.Thread;

public class StorageMain {
	public static void main(String args[]){
		Storage st = new Storage(100);
		
		//消费者
		Cousrtem ct1 = new Cousrtem(st,20);
		Cousrtem ct2 = new Cousrtem(st,70);
		Cousrtem ct3 = new Cousrtem(st,40);
		
		//生产者
		Producter pd1 = new Producter(st,60);
		Producter pd2 = new Producter(st,80);
		Producter pd3 = new Producter(st,20);
		new Thread(ct1).start();
		new Thread(ct2).start();
		new Thread(ct3).start();
		new Thread(pd1).start();
		new Thread(pd2).start();
		new Thread(pd3).start();
	}
}
