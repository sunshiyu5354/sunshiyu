package com.Thread;

public class Chuangkou {
	private static int number = 50;
	private String name;
	public Chuangkou(int number,String name){
		//this.number = number;
		this.name = name;
	}	
	public void sale(){	
		while(true){
			if(number<1){
				System.out.println("票售罄");
				break;
			}
			number--;
			System.out.println(name+"卖出了第"+number+"张票");
		}
	}
}
