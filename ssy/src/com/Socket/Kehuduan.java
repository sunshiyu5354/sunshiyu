package com.Socket;

import java.io.*;
import java.net.*;
import java.util.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Kehuduan {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(43211);
			System.out.println("�ͻ��˴����ɹ�");
			while(true){
			Socket soc = server.accept();
			System.out.println("���ڼ����˿�");
			String add = new String(soc.getInetAddress().getHostAddress());
			System.out.println("���˷��ʵ�ַΪ"+add);
			InputStream is = soc.getInputStream();
			byte [] bytes = new byte[1024];
			int len = 0;
			StringBuffer ss = new StringBuffer();
			while((len = is.read(bytes)) != -1){
				ss.append(new String(bytes,0,len));
			}
			System.out.println("������:");
			System.out.println("�ͻ��ˣ�"+ ss);
			is.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


