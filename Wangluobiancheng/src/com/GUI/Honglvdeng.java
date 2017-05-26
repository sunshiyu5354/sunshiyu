package com.GUI;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.text.*;
import java.util.concurrent.*;
import javax.xml.stream.events.*;

public class Honglvdeng extends JFrame {
	public Honglvdeng(){
		this.setLayout(null);//设置用户界面上的屏幕组件
		this.setTitle("交通信号灯");//标题
		//Icon icon = new ImageIcon("Users/asus/");
		
		JTextArea jtextarea = new JTextArea();
		jtextarea.setText("");
		jtextarea.setOpaque(true);
		jtextarea.setBounds(10,100,500,100);
		this.add(jtextarea);
		
		JButton jbutton1 = new JButton();//定义控件
		jbutton1.setText("开始");//内容
		jbutton1.setBounds(200, 20, 100, 50);//位置大小
		jbutton1.setFont(new java.awt.Font("微软雅黑",0,18));//字体
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
												jtextarea.setText("红灯停");
												jtextarea.setBackground(Color.red);
												Thread.sleep(3000);
												jtextarea.setText("绿灯行");
												jtextarea.setBackground(Color.green);
												Thread.sleep(1000);
												jtextarea.setText("黄灯亮了等一等");
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
		this.setVisible(true);//设置是否显示
		}
	public static void main(String [] args){
		new Honglvdeng();
		
	}
}

