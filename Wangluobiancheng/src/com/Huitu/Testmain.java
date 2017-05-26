package com.Huitu;

import java.awt.*;
import javax.swing.*;
public class Testmain extends JFrame{
	public Testmain(){
		this.setLayout(null);
		TestPaint testpaint = new TestPaint();
		testpaint.setBounds(20,20,550,550);
		this.add(testpaint);
		this.setTitle("Îå×ÓÆå");
		this.setBounds(250,250,600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String args[]){
		new Testmain();
	}
}
