package com.Thread;

public class Producter implements Runnable{
	private Storage st;
	private int number;
	public Producter(Storage st,int number){
		this.st = st;
		this.number = number;
	}
	public void run(){
		st.push(number);
	}
}
