package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		File f = new File("Test.txt");
		if(!f.exists()){
			try{
				f.createNewFile();			
			}catch(IOException e){
				e.printStackTrace();
			}
			String us = "";
			System.out.println("请输入文件内容");
			us = sc.nextLine();
			StringBuffer stringBuffer = new StringBuffer();
			int len;
			byte[] b = new byte[1024];
			FileInputStream file = null;
			try{
				file = new FileInputStream(f);
				while((len=file.read(b))!=-1){
					stringBuffer.append(new String(b));
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if(file != null){
					try{
						file.close();
					}catch(IOException e){
						e.printStackTrace();
					}
				}
			}
		}
	}
}
