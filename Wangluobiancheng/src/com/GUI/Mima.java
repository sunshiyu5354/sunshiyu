package com.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class Mima extends JFrame{
	public Mima(){
			this.setLayout(null);
			this.setTitle("验证密码是否正确");
			
			JLabel jlabel = new JLabel();
			jlabel.setText("显示内容");
			jlabel.setBounds(80,150,100,30);
			this.add(jlabel);
			
			JLabel JLabel1 = new JLabel();
			JLabel1.setText("请输入账号:");
			JLabel1.setBounds(80,60,100,30);
			this.add(JLabel1);
			
			JTextArea jtextarea = new JTextArea();
			jtextarea.setText("");
			jtextarea.setBounds(150,60,150,30);
			this.add( jtextarea);
			
			JLabel JLabel2 = new JLabel();
			JLabel2.setText("请输入密码:");
			JLabel2.setBounds(80,100,100,30);
			this.add(JLabel2);
			
			JPasswordField jpw = new JPasswordField();//定义控件
			jpw.setText("");
			jpw.setBounds(150, 100, 150, 30);//设置控件的位置
			this.add(jpw);//将其放到窗口中

			JButton jButton = new JButton();//定义控件
			jButton.setText("登录");//设置实现
			jButton.setBounds(150, 150, 150, 30);//设置控件的位置
			jButton.setOpaque(true);
			jButton.setBackground(Color.BLUE);
			jButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.out.println("");
					jlabel.setText(jpw.getText());
				}
			});
			this.add(jButton);//将其放到窗口中
			
			//公共的
			this.setBounds(300,300,500,500);//定义窗口大小
			this.setVisible(true);//定义窗口是否可见
		}
	public static void main(String [] args){
		new Mima();
	}
}
