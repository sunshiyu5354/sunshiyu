package com.GUI;

import java.awt.Color;
import javax.swing.*;

public class Gui extends JFrame{
	public Gui(){
		this.setLayout(null);
		JLabel jlabel = new JLabel();
		jlabel.setText("���¼"); 
		jlabel.setBounds(20,20, 80, 50);
		this.add(jlabel);
		
		JTextArea jlabel2 = new JTextArea();
		jlabel2.setText("�������˺�");
		jlabel2.setBounds(20,80, 100, 50);
		this.add(jlabel2);
		
		JTextArea jlabel3 = new JTextArea();
		jlabel3.setText("����������");
		jlabel3.setBounds(20,150, 100, 50);
		this.add(jlabel3);
		
		JButton jlabel4 = new JButton();
		jlabel4.setText("��¼");
		jlabel4.setBounds(20,220, 80, 20);
		jlabel4.setOpaque(true);
		jlabel4.setBackground(Color.BLUE);
		jlabel4.setForeground(Color.RED);
		this.add(jlabel4);
		
		this.setBounds(200,200,500,500);
		this.setVisible(true);
	}
	public static void main(String args[]){
		new Gui();
	}
}
