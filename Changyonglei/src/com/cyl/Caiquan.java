package com.cyl;

import java.util.Scanner;
public class Caiquan {
	public static void main(String args[]){
		menu();
	}
	public static void menu(){
		System.out.println("��������Ҫ������ (1.���� 2.���� 3.��)");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int cq = sc.nextInt();
		switch(cq){
		case 1:
			if(cq == 1){
				System.out.println("����ļ���");
			}
			break;
		case 2:
			if(cq == 2){
				System.out.println("����İ���");
			}
			break;
		case 3:
			if(cq == 3){
				System.out.println("����Ĵ�");
			}
			break;
		}
		menu();
	}
}
