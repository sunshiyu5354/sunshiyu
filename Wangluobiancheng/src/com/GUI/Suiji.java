package com.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class Suiji extends JFrame{
	int p=0;
	public static void main(String [] args){
		new Suiji();
	}
	
	public Suiji(){
			this.setLayout(new FlowLayout());
			this.setTitle("输入一个数与随机数比较");
			JTextArea jTextArea = new JTextArea();//定义控件
			jTextArea.setText("请输入一个数");
			jTextArea.setBounds(30, 30, 100, 20);//设置控件的位置
			this.add(jTextArea);//将其放到窗口中

			JButton jButton = new JButton();//定义控件
			jButton.setText("开始");//设置实现
			jButton.setBounds(30, 50, 100, 20);//设置控件的位置
			this.add(jButton);//将其放到窗口中
			
			JLabel jLabel = new JLabel();
			jLabel.setText("随机数");//要实现的内容
			jLabel.setOpaque(true);
			jLabel.setBounds(30,70,100,20);//设置控件的位置
			this.add(jLabel);//将其放到窗口中

			JButton jButton2 = new JButton();//定义控件
			jButton2.setText("结束");//设置实现
			jButton2.setBounds(30, 90, 100, 20);//设置控件的位置
			this.add(jButton2);//将其放到窗口中
			
			JTextArea jTextArea2 = new JTextArea();//定义控件
			jTextArea2.setText("结果");
			jTextArea2.setBounds(30, 110, 100, 20);//设置控件的位置
			this.add(jTextArea2);//将其放到窗口中
			
			//公共的
			this.setBounds(500,300,500,300);//定义窗口大小
			this.setVisible(true);//定义窗口是否可见
			
			jButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					p = 2;
					new Thread(new Runnable() {
						public void run() {
							while(p==2){
								jLabel.setText((int)(Math.random()*95)+5+"");
							}
							try {
								Thread.sleep(1000);
							} catch (Exception e) {
								e.printStackTrace();
							}	
						}
					}).start();
				}
			});
			
			jButton2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					p = 1;
					String i = jTextArea.getText();
					String r = jLabel.getText();
					if(i.equals(r)){
						jTextArea2.setText("相同");
					}else{
						jTextArea2.setText("不同");
					}
				}
			});
		}
}
