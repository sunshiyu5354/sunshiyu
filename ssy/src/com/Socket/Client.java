package com.Socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client { 
	public static void main(String[] args){
		try{
			Socket client=new Socket("192.168.199.142",7878);//IP��ַ�Ǹ��ַ������˿ں��Ǹ�����������˿ں�Ҫ��ǰ����д���Ǹ�һ��������IP��ַ��д��Ļ�����IP��ַ
			InputStream is=client.getInputStream();//��ߵ�������������������Ĳ�������
			BufferedReader bf=new BufferedReader(new InputStreamReader(is));
			OutputStream os=client.getOutputStream();   
			PrintStream ps=new PrintStream(os);
			Scanner scanner=new Scanner(System.in);
			boolean flag=true;
			while(flag){ //��仰�����ÿͻ��˲�ͣ��˵��
				String s2=scanner.nextLine();
				ps.println(s2);
    
				String s=bf.readLine();
				System.out.println(s);   }
   
			client.close();
   
		} 
		catch (UnknownHostException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
  		} 
	}
}
