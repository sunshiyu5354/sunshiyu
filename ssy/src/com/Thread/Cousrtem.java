package com.Thread;

public class Cousrtem implements Runnable{
	private Storage st;
	private int number;
	public Cousrtem(Storage st,int number){
		this.st = st;
		this.number = number;
	}
	public void run(){
		st.pop(number);
	}
}
