package com.GUI;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.text.*;
import java.util.concurrent.*;
import javax.xml.stream.events.*;

public class Honglvdeng extends JFrame {
	public Honglvdeng(){
		this.setLayout(null);//�����û������ϵ���Ļ���
		this.setTitle("��ͨ�źŵ�");//����
		//Icon icon = new ImageIcon("Users/asus/");
		
		JTextArea jtextarea = new JTextArea();
		jtextarea.setText("");
		jtextarea.setOpaque(true);
		jtextarea.setBounds(10,100,500,100);
		this.add(jtextarea);
		
		JButton jbutton1 = new JButton();//����ؼ�
		jbutton1.setText("��ʼ");//����
		jbutton1.setBounds(200, 20, 100, 50);//λ�ô�С
		jbutton1.setFont(new java.awt.Font("΢���ź�",0,18));//����
		this.add(jbutton1);
		
		jbutton1.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String s = jtextarea.getText();
						new Thread(
								new Runnable(){

									@Override
									public void run() {
										// TODO Auto-generated method stub
										while(true){
											try{
												Thread.sleep(3000);		
												jtextarea.setText("���ͣ");
												jtextarea.setBackground(Color.red);
												Thread.sleep(3000);
												jtextarea.setText("�̵���");
												jtextarea.setBackground(Color.green);
												Thread.sleep(1000);
												jtextarea.setText("�Ƶ����˵�һ��");
												jtextarea.setBackground(Color.yellow);
											}catch(Exception e){
												e.printStackTrace();
											}
										}
									}
									
								}
								).start();
					}
					
				}
				
				);
		this.setBounds(300,300,500,500);
		this.setVisible(true);//�����Ƿ���ʾ
		}
	public static void main(String [] args){
		new Honglvdeng();
		
	}
}

