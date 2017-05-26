package com.qunliao;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		List<Socket> list = new ArrayList<Socket>();
		Map<String, Socket> socketHashMap = new HashMap<String, Socket>();
		try {
			serverSocket = new ServerSocket(1357);
			System.out.println("1357�˿ڴ����ɹ�");
			while (true) {
				socket = serverSocket.accept();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String name = bufferedReader.readLine();
				socketHashMap.put(name, socket);// ӳ�����ֺͿͻ��ˡ�
				list.add(socket);
				new Thread(new ServerThread(socket, list, socketHashMap)).start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
