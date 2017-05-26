package com.Zuoye3;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
	public static void main(String args[]){
		Socket socket = null;
		try{
			socket = new Socket("192.168.199.142",7788);
			PrintWriter printwriter = new PrintWriter(socket.getOutputStream());
			printwriter.write("Ë«»÷ÆÁÄ»666\n");
			printwriter.flush();
			
			new Thread(new OutRunnable(socket)).start();//·¢
			new Thread(new InRunnable(socket)).start();//ÊÕ
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
