package com.IO;
import java.io.*;

public class File {

	public static void main(String[] args) {
		int count=0;
		InputStream in = null;
		try{
			in = new FileInputStream(new File("D:/files/du.txt"));
			while(in.read()!=-1){//��ȡ�ļ��ֽڣ�����������һ���ֽ�
				count++;
				System.out.println();
			}
			System.out.println("����"+count+"\t");
			/*byte[] b = new byte[4];
			in.read(b, 1, 2);*/ 
			in.close();//�رմ��ļ����������ͷ�������йص�����ϵͳ��Դ
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



