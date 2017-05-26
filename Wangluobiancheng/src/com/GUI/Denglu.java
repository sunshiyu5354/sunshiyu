package com.GUI;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Denglu extends JFrame {
	
	public  Denglu(){
		this.setLayout(null);
		this.setTitle("QQ");
		
		JLabel jlabel = new JLabel();
		jlabel.setText("QQ");
		jlabel.setBounds(10, 10, 20, 20);
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
		this.add(jpw);
		
		JButton jButton = new JButton();//定义控件
		jButton.setText("登录");//设置实现
		jButton.setBounds(150, 150, 150, 30);//设置控件的位置
		jButton.setOpaque(true);
		jButton.setBackground(Color.BLUE);
		this.add(jButton);
		
		jButton.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String i = jtextarea.getText();
						String j = jpw.getText();
						if(i.equals("535499604")&&j.equals("5354")){
							System.out.println("登陆成功");
							new Denglu();
						}else{
							System.out.println("账号或密码错误");
						}
					}
					
				}
				);
		//公共的
		this.setBounds(300,300,500,500);
		this.setVisible(true);
	}
	public static void main(String [] args){
		new Denglu();
		
	}
}

