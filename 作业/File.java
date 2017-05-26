package com.IO;
import java.io.*;

public class File {

	public static void main(String[] args) {
		int count=0;
		InputStream in = null;
		try{
			in = new FileInputStream(new File("D:/files/du.txt"));
			while(in.read()!=-1){//读取文件字节，并递增到下一个字节
				count++;
				System.out.println();
			}
			System.out.println("长度"+count+"\t");
			/*byte[] b = new byte[4];
			in.read(b, 1, 2);*/ 
			in.close();//关闭此文件输入流并释放与此流有关的所有系统资源
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				in.close();
			}catch(IOException io){
				io.printStackTrace();
			}
		}	
	}
}



