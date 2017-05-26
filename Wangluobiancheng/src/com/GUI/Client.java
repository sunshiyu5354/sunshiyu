package com.GUI;

import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Client extends JFrame{
	public Client(Socket socket){
		super();
		this.setLayout(null);
		JTextArea jlabel = new JTextArea();
		jlabel.setOpaque(true);
		jlabel.setBackground(Color.WHITE);
		jlabel.setEnabled(false);
		jlabel.setBounds(0,0,500,350);
		this.add(jlabel);
		JTextField field = new JTextField();
		field.setBounds(0,350,500,30);
		this.add(field);
		JButton jbutton = new JButton("����");
		jbutton.setBounds(180,400,100,30);
		jbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//1.��ȡ�û���������
				String neirong = field.getText();
				if(!"".equals(neirong)){
					//2.�ҵ�scoket
					try{
						PrintWriter printwriter = new PrintWriter(socket.getOutputStream());
						printwriter.write(neirong+"\n");
						printwriter.flush();
					}catch(Exception e1){
						e1.printStackTrace();
					}
				}
				field.setText("");
				//3.����
				//4.�������
			}		
		
		});
		this.add(jbutton);
		new Thread(new ShouRunnable(socket,jlabel)).start();
		JButton jbutton1 = new JButton("�鿴��ʷ��¼");
		jbutton1.setBounds(160,480,150,30);
		jbutton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//1.��ȡ�û���������
				String neirong = field.getText();
				if(!"".equals(neirong)){
					//2.�ҵ�scoket
					try{
						PrintWriter printwriter = new PrintWriter(socket.getOutputStream());
						printwriter.write(neirong+"\n");
						printwriter.flush();
					}catch(Exception e1){
						e1.printStackTrace();
					}
				}
				field.setText("");
			}		
		});
		this.add(jbutton1);
		this.setBounds(300,300,500,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String args[]){
		Socket socket = null;
		try{
			socket = new Socket("192.168.199.142",53545);
			//���߷�������˭
			PrintWriter printwriter = new PrintWriter(socket.getOutputStream());
			printwriter.write("��˵:\n");
			printwriter.flush();
			new Client(socket);	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}