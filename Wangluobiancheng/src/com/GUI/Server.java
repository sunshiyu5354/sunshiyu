package com.GUI;

import java.io.*;
import java.net.*;
import java.util.*;

import com.Zuoye3.ClientRunnable;

public class Server {
	public static void main(String args[]){
		ServerSocket serversocket = null;
		Socket socket = null;
		List<Socket> list = new ArrayList<Socket>();
		Map<String,Socket> socketHashMap = new HashMap<String,Socket>(); 
		try{
			ServerSocket ss = new ServerSocket(53545);
			System.out.println("端口创建成功了");
		while(true){
			socket = ss.accept();
			BufferedReader buffered = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String name = buffered.readLine();
			socketHashMap.put(name,socket);
			list.add(socket);
			new Thread(new ClientRunnable(socket,list,socketHashMap)).start();
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

