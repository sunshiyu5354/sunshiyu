package com.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Menu extends JFrame{
	public Menu(){
		this.setLayout(null);
		//����˵�
		JMenuBar jmenubar = new JMenuBar();
		this.setTitle("���±�");
		jmenubar.setFont(new java.awt.Font("΢���ź�",1,16));
		JMenu jmenu = new JMenu();
		jmenu.setText("�ļ�(F)");
		JMenu jmenu1 = new JMenu();
		jmenu1.setText("�༭(E)");
		JMenu jmenu2 = new JMenu();
		jmenu2.setText("��ʽ(O)");
		JMenu jmenu3 = new JMenu();
		jmenu3.setText("�鿴(V)");
		JMenu jmenu4 = new JMenu();
		jmenu4.setText("����(H)");
		
		JMenuItem jmenuitem = new JMenuItem();
		jmenuitem.setText("�½�(N)");
		JMenuItem jmenuitem1 = new JMenuItem();
		jmenuitem1.setText("��(O)");
		JMenuItem jmenuitem2 = new JMenuItem();
		jmenuitem2.setText("����(S)");
		JMenuItem jmenuitem3 = new JMenuItem();
		jmenuitem3.setText("���Ϊ(A)");
		JMenuItem jmenuitem4 = new JMenuItem();
		jmenuitem4.setText("ҳ�����(U)");
		JMenuItem jmenuitem5 = new JMenuItem();
		jmenuitem5.setText("��ӡ(P)");
		JMenuItem jmenuitem6 = new JMenuItem();
		jmenuitem6.setText("�˳�(X)");
		JMenuItem jmenuitem7 = new JMenuItem();
		jmenuitem7.setText("����(U)");
		JMenuItem jmenuitem8 = new JMenuItem();
		jmenuitem8.setText("����(T)");
		JMenuItem jmenuitem9 = new JMenuItem();
		jmenuitem9.setText("�Զ�����(W)");
		JMenuItem jmenuitem10 = new JMenuItem();
		jmenuitem10.setText("״̬��(S)");
		JMenuItem jmenuitem11 = new JMenuItem();
		jmenuitem11.setText("�鿴����(H)");
		
		jmenu.add(jmenuitem);
		jmenu.add(jmenuitem1);
		jmenu.add(jmenuitem2);
		jmenu.add(jmenuitem3);
		jmenu.add(jmenuitem4);
		jmenu.add(jmenuitem5);
		jmenu.add(jmenuitem6);
		jmenu1.add(jmenuitem7);
		jmenu1.add(jmenuitem8);
		jmenu2.add(jmenuitem9);
		jmenu3.add(jmenuitem10);
		jmenu4.add(jmenuitem11);
		
		jmenubar.add(jmenu);
		jmenubar.add(jmenu1);
		jmenubar.add(jmenu2);
		jmenubar.add(jmenu3);
		jmenubar.add(jmenu4);
		this.setJMenuBar(jmenubar);
		
		//�ı���
		JTextArea jtextarea = new JTextArea();
		jtextarea.setText("");
		jtextarea.setBounds(0,0,500,500);
		this.add( jtextarea);
		//ָ�����ܵ���ť
		jmenuitem2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
				File file = new File("E://test.txt");
				FileWriter fw = null;
				try {
					fw = new FileWriter(file);
					String ss = jtextarea.getText();
					fw.write(ss);
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JTextField jtf = new JTextField();
				jtf.setText("����ɹ�");
				jtf.setFont(new java.awt.Font("΢���ź�",0,20));
				jtf.setBounds(160, 100, 120, 40);
				jtf.add(jtf);
			}
			
			
		});
		
		//������
		this.setBounds(300,300,500,500);
		this.setVisible(true);
	}
	public static void main(String args[]){
		new Menu();
	}
}

