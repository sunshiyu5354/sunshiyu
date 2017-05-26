package com.zuche;
import java.util.Scanner;
public class zucheDemo {
	static Scanner sc = new Scanner(System.in);
	static zuche[] zc = new zuche[6];
	private static int i;
	public static void main(String args[]){
		menu();
	}
	public static void menu(){
		System.out.println("*****欢迎使用租车系统！*****");
		System.out.println("*****你确定租车吗？*****");
		System.out.println("1.是(请输入1) 2.否(请输入2)");
		int f = sc.nextInt();
		if(f == 2){
			System.out.println("*****谢谢使用，再见*****");
			menu();
		}
		if(f == 1){
			list();
		}
	}
	@SuppressWarnings("unused")
	public static void list(){
		System.out.println("*****您可租车的类型及价目表*****");
		zc[0] = new Manned(1, "奥迪", 4,500);
		zc[1] = new Manned(2, "马自达6",4,400);
		zc[2] = new Zairh(3,"皮卡雪6",4,2,450);
		zc[3] = new Manned(4,"金龙",20,800);
		zc[4] = new Zaihuo(5,"松花江",4,400);
		zc[5] = new Zaihuo(6,"依维柯",20,1000);
		System.out.println("序号\t"+"车名\t"+"载客数(人)\t"+"载货量(吨)\t"+"日租金(元/天)\t");
		for(int i=0;i<zc.length;i++){
			zc[i].toString();
		}
		System.out.println("*****请输入您的租车数量:*****");
		int sl = sc.nextInt();
		int[] zl = new int[6];
		for(int i=1;i<=sl;i++){
			System.out.println("*****请输入第"+i+"辆车的序号:*****");
			int nums = sc.nextInt() - 1;
			System.out.println(zc[nums]);
		System.out.println("*****请输入天数:*****");
		int Numdays = sc.nextInt(); 
		}
		System.out.println("*****您的账单*****");
		System.out.println("已选载人车"+zc[i].getBrand());
		System.out.println("租车总费用："+"元");
		System.out.println("*****感谢您的惠顾，欢迎再次光临！*****");
	}
}
