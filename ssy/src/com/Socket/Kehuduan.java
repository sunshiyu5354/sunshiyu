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
			System.out.println("客户端创建成功");
			while(true){
			Socket soc = server.accept();
			System.out.println("正在监听端口");
			String add = new String(soc.getInetAddress().getHostAddress());
			System.out.println("有人访问地址为"+add);
			InputStream is = soc.getInputStream();
			byte [] bytes = new byte[1024];
			int len = 0;
			StringBuffer ss = new StringBuffer();
			while((len = is.read(bytes)) != -1){
				ss.append(new String(bytes,0,len));
			}
			System.out.println("服务器:");
			System.out.println("客户端："+ ss);
			is.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


