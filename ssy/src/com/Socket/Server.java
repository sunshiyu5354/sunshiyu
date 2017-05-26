package com.Socket;

import java.util.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
	 public static void main(String[] args)
	 {
	  try {
	   ServerSocket server=new ServerSocket(7878);//定义客户端的端口号
	   System.out.println("客户端创建成功");
	   Socket client=server.accept();//定义一个Socket对象
	   
	   InputStream is=client.getInputStream();//服务器接受信息输入流，也就是接受从服务器段发送过来的消息
	   BufferedReader br=new BufferedReader(new InputStreamReader(is));//用bufferedreader包装下输入流
	   
	   OutputStream os=client.getOutputStream();//这是用来给服务器发送消息的输出流
	   PrintStream ps=new PrintStream(os);
	   Scanner scanner=new Scanner(System.in);//从键盘输入字符串
	      
	   boolean flag=true;//定义一个死循环，让服务器不停的接受从客户端发送来的字符串
	   while(flag)
	   { 
	       String s=br.readLine();//s是从客户端接受到得字符串
	       System.out.println(s);
	    
	    String s2=scanner.nextLine();//s2是写给客户端的字符串
	    ps.println(s2);    //给客户端发送你写的东西
	   }
	   client.close();     
	  } catch (IOException e) {//try 跟catch你不用管，这是用来处理异常的，就是固定格式
	   
	   e.printStackTrace();
	  }       
	}
}
