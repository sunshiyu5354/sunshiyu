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
			this.setTitle("����һ������������Ƚ�");
			JTextArea jTextArea = new JTextArea();//����ؼ�
			jTextArea.setText("������һ����");
			jTextArea.setBounds(30, 30, 100, 20);//���ÿؼ���λ��
			this.add(jTextArea);//����ŵ�������

			JButton jButton = new JButton();//����ؼ�
			jButton.setText("��ʼ");//����ʵ��
			jButton.setBounds(30, 50, 100, 20);//���ÿؼ���λ��
			this.add(jButton);//����ŵ�������
			
			JLabel jLabel = new JLabel();
			jLabel.setText("�����");//Ҫʵ�ֵ�����
			jLabel.setOpaque(true);
			jLabel.setBounds(30,70,100,20);//���ÿؼ���λ��
			this.add(jLabel);//����ŵ�������

			JButton jButton2 = new JButton();//����ؼ�
			jButton2.setText("����");//����ʵ��
			jButton2.setBounds(30, 90, 100, 20);//���ÿؼ���λ��
			this.add(jButton2);//����ŵ�������
			
			JTextArea jTextArea2 = new JTextArea();//����ؼ�
			jTextArea2.setText("���");
			jTextArea2.setBounds(30, 110, 100, 20);//���ÿؼ���λ��
			this.add(jTextArea2);//����ŵ�������
			
			//������
			this.setBounds(500,300,500,300);//���崰�ڴ�С
			this.setVisible(true);//���崰���Ƿ�ɼ�
			
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
						jTextArea2.setText("��ͬ");
					}else{
						jTextArea2.setText("��ͬ");
					}
				}
			});
		}
}
