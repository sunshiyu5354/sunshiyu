package com.GUI;

import java.io.*;
import java.net.*;
import java.util.List;
import java.util.Map;

import javax.swing.*;

public class ShouRunnable implements Runnable{
	Socket socket;
	JTextArea jlabel;
	
	public ShouRunnable(Socket socket,JTextArea jlabel){
		this.socket = socket;
		this.jlabel = jlabel;
	}
	public ShouRunnable(Socket socket2, List<Socket> list, Map<String, Socket> socketHashMap) {
		// TODO Auto-generated constructor stub
	}
	public void run(){
		while(true){
			try{
				//���շ������˷�������
				BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String neirong = bufferedreader.readLine();
				System.out.println("�յ�����"+neirong);
				//��ʾ��JLabel��
				jlabel.setText(jlabel.getText()+"\n"+neirong);
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
