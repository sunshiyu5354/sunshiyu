package com.Socket;

import java.util.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
	 public static void main(String[] args)
	 {
	  try {
	   ServerSocket server=new ServerSocket(7878);//����ͻ��˵Ķ˿ں�
	   System.out.println("�ͻ��˴����ɹ�");
	   Socket client=server.accept();//����һ��Socket����
	   
	   InputStream is=client.getInputStream();//������������Ϣ��������Ҳ���ǽ��ܴӷ������η��͹�������Ϣ
	   BufferedReader br=new BufferedReader(new InputStreamReader(is));//��bufferedreader��װ��������
	   
	   OutputStream os=client.getOutputStream();//����������������������Ϣ�������
	   PrintStream ps=new PrintStream(os);
	   Scanner scanner=new Scanner(System.in);//�Ӽ��������ַ���
	      
	   boolean flag=true;//����һ����ѭ�����÷�������ͣ�Ľ��ܴӿͻ��˷��������ַ���
	   while(flag)
	   { 
	       String s=br.readLine();//s�Ǵӿͻ��˽��ܵ����ַ���
	       System.out.println(s);
	    
	    String s2=scanner.nextLine();//s2��д���ͻ��˵��ַ���
	    ps.println(s2);    //���ͻ��˷�����д�Ķ���
	   }
	   client.close();     
	  } catch (IOException e) {//try ��catch�㲻�ùܣ��������������쳣�ģ����ǹ̶���ʽ
	   
	   e.printStackTrace();
	  }       
	}
}
