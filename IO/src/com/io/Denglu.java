package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Denglu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("htest.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			String userInput = "";
			System.out.println("������");
			userInput = sc.nextLine();
			//�ȶ�ȡԭ������
			StringBuffer stb = new StringBuffer();
			int len = 0;
			byte [] bytes = new byte[10];
			FileInputStream fi = null;
			try {
				fi = new FileInputStream(file);
				while((len = fi.read(bytes))!=-1){
					stb.append(new String(bytes,0,len));
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if(fi !=null){
					try {
						fi.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			//ԭ���ļ������ڵ�һ������
			String ss = stb + userInput;
			FileWriter fw = null;
			try {
				fw = new FileWriter(file);
				fw.write(ss+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if(fw !=null){
					try {
						fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
		System.out.println("�������û���");
		String z = sc.nextLine();
		System.out.println("����������");
		String v = sc.nextLine();
		String c = z+v;
		if(c.equals(ss)){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��½ʧ��\n"+"���������û�������");
		}
		
	}

}



