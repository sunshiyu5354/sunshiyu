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
			System.out.println("请输入");
			userInput = sc.nextLine();
			//先读取原来内容
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
			//原来的加上现在的一起输入
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
		
		System.out.println("请输入用户名");
		String z = sc.nextLine();
		System.out.println("请输入密码");
		String v = sc.nextLine();
		String c = z+v;
		if(c.equals(ss)){
			System.out.println("登录成功");
		}else{
			System.out.println("登陆失败\n"+"请检查您的用户名密码");
		}
		
	}

}



