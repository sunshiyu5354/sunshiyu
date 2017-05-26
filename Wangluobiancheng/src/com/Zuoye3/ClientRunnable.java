package com.Zuoye3;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientRunnable implements Runnable{
	Socket socket = null;
	List<Socket> sockes; 
	Map<String,Socket> socketHashMap = new HashMap<String,Socket>();
	public ClientRunnable(Socket socket,List<Socket> sockes,Map<String,Socket> socketHashMap){
		this.socket = socket;
		this.sockes = sockes;
		this.socketHashMap = socketHashMap;
	}
	public void run(){
		while(true){
			try{
				BufferedReader buffered = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String xiaoxi = null;
				xiaoxi = buffered.readLine();
				//查找是谁发送的
				Set<String> keys = socketHashMap.keySet();
				String name = "";
				for(String s:keys){
					Socket soc = socketHashMap.get(s);
					if(socket == soc){
						name = s;
					}
				}
				System.out.println("客户端返回内容为"+name+xiaoxi);
				String s = name+"说:"+xiaoxi;
				for(Socket socket1:sockes){
				PrintWriter printwriter = new PrintWriter(socket1.getOutputStream());
				printwriter.write(s+"\n");
				printwriter.flush( );
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}


