package com.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class Mima extends JFrame{
	public Mima(){
			this.setLayout(null);
			this.setTitle("��֤�����Ƿ���ȷ");
			
			JLabel jlabel = new JLabel();
			jlabel.setText("��ʾ����");
			jlabel.setBounds(80,150,100,30);
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
			this.add(jpw);//����ŵ�������

			JButton jButton = new JButton();//����ؼ�
			jButton.setText("��¼");//����ʵ��
			jButton.setBounds(150, 150, 150, 30);//���ÿؼ���λ��
			jButton.setOpaque(true);
			jButton.setBackground(Color.BLUE);
			jButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.out.println("");
					jlabel.setText(jpw.getText());
				}
			});
			this.add(jButton);//����ŵ�������
			
			//������
			this.setBounds(300,300,500,500);//���崰�ڴ�С
			this.setVisible(true);//���崰���Ƿ�ɼ�
		}
	public static void main(String [] args){
		new Mima();
	}
}
