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
		System.out.println("*****��ӭʹ���⳵ϵͳ��*****");
		System.out.println("*****��ȷ���⳵��*****");
		System.out.println("1.��(������1) 2.��(������2)");
		int f = sc.nextInt();
		if(f == 2){
			System.out.println("*****ллʹ�ã��ټ�*****");
			menu();
		}
		if(f == 1){
			list();
		}
	}
	@SuppressWarnings("unused")
	public static void list(){
		System.out.println("*****�����⳵�����ͼ���Ŀ��*****");
		zc[0] = new Manned(1, "�µ�", 4,500);
		zc[1] = new Manned(2, "���Դ�6",4,400);
		zc[2] = new Zairh(3,"Ƥ��ѩ6",4,2,450);
		zc[3] = new Manned(4,"����",20,800);
		zc[4] = new Zaihuo(5,"�ɻ���",4,400);
		zc[5] = new Zaihuo(6,"��ά��",20,1000);
		System.out.println("���\t"+"����\t"+"�ؿ���(��)\t"+"�ػ���(��)\t"+"�����(Ԫ/��)\t");
		for(int i=0;i<zc.length;i++){
			zc[i].toString();
		}
		System.out.println("*****�����������⳵����:*****");
		int sl = sc.nextInt();
		int[] zl = new int[6];
		for(int i=1;i<=sl;i++){
			System.out.println("*****�������"+i+"���������:*****");
			int nums = sc.nextInt() - 1;
			System.out.println(zc[nums]);
		System.out.println("*****����������:*****");
		int Numdays = sc.nextInt(); 
		}
		System.out.println("*****�����˵�*****");
		System.out.println("��ѡ���˳�"+zc[i].getBrand());
		System.out.println("�⳵�ܷ��ã�"+"Ԫ");
		System.out.println("*****��л���Ļݹˣ���ӭ�ٴι��٣�*****");
	}
}
