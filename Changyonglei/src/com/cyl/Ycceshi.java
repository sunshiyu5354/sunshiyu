package com.cyl;

public class Ycceshi {
	public static void main(String args[]){
		Ycceshi e = new Ycceshi();
		e.add();
	}
	int num3 = 1;
	public void add(){
		int num1 = 2;
		int num2 = 0;
		try{
			@SuppressWarnings("unused")
			int num3 = num1/num2;
		}catch(Exception e){
			e.getMessage();
			System.out.println("��׽�쳣");
			return;
		}finally{
			System.out.println("���մ�����");
		}
		System.out.println(num3);
	}
}
