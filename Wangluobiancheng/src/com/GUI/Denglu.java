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
		JLabel1.setText("�������˺�:");
		JLabel1.setBounds(80,60,100,30);
		this.add(JLabel1);
		
		JTextArea jtextarea = new JTextArea();
		jtextarea.setText("");
		jtextarea.setBounds(150,60,150,30);
		this.add( jtextarea);
		
		JLabel JLabel2 = new JLabel();
		JLabel2.setText("����������:");
		JLabel2.setBounds(80,100,100,30);
		this.add(JLabel2);
		
		JPasswordField jpw = new JPasswordField();//����ؼ�
		jpw.setText("");
		jpw.setBounds(150, 100, 150, 30);//���ÿؼ���λ��
		this.add(jpw);
		
		JButton jButton = new JButton();//����ؼ�
		jButton.setText("��¼");//����ʵ��
		jButton.setBounds(150, 150, 150, 30);//���ÿؼ���λ��
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
							System.out.println("��½�ɹ�");
							new Denglu();
						}else{
							System.out.println("�˺Ż��������");
						}
					}
					
				}
				);
		//������
		this.setBounds(300,300,500,500);
		this.setVisible(true);
	}
	public static void main(String [] args){
		new Denglu();
		
	}
}

