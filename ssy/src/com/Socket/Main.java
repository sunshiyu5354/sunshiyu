package com.Socket;
import java.io.*;
import java.net.Socket;

public class Main {
	public static void main(String [] args){
		try{
			Socket socket = new Socket("192.168.199.142",43211);
			System.out.println("�Ƿ�����"+socket.isConnected());
			OutputStream o = socket.getOutputStream();
			o.write("����nidie".getBytes());
			o.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}

