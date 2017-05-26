//石头剪子布
package com.cyl;

import java.util.Scanner;
public class CaiquanMain {

	public static void main(String[] args) {
		System.out.println("输入一个数 1=石头  2=剪子   3= 布");
		Scanner z = new Scanner(System.in);
		int a = z.nextInt();
		int c = (int)(Math.random()*3+1);
		System.out.println(c);
		new Jianzi1().ff(a, c);
	}
}
