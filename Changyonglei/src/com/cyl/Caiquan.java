package com.cyl;

import java.util.Scanner;
public class Caiquan {
	public static void main(String args[]){
		menu();
	}
	public static void menu(){
		System.out.println("请输入你要出的数 (1.剪刀 2.包袱 3.锤)");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int cq = sc.nextInt();
		switch(cq){
		case 1:
			if(cq == 1){
				System.out.println("你出的剪刀");
			}
			break;
		case 2:
			if(cq == 2){
				System.out.println("你出的包袱");
			}
			break;
		case 3:
			if(cq == 3){
				System.out.println("你出的锤");
			}
			break;
		}
		menu();
	}
}
