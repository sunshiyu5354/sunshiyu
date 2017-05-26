package com.io;

import java.io.*;

import java.util.*;

public class RandomAccessfileDemo {

	public static void main(String[] args) {
		File file = new File("src/com/io/Demo.txt");
		Scanner sc = new Scanner(System.in);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String userInput="";
		System.out.println("请输入文件内容");
		userInput = sc.nextLine()+"\n";
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(file,"rw");
			raf.seek(file.length());
			raf.write(userInput.getBytes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(raf!=null){
				try {
					raf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		StringBuffer stb = new StringBuffer();
		int len = 0;
		byte [] bytes = new byte[10];
		FileInputStream fi = null;
		try {
			fi = new FileInputStream(file);
			while((len = fi.read(bytes))!=-1){
				stb.append(new String(bytes,0,len));
			}
			System.out.println(stb);
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
		
	}

}

