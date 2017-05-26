package com.qunliao;

import java.awt.Color;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.sql.*;
import javax.swing.*;

import com.qunliao.MyConnection;

public class Client extends JFrame {

	public Client(Socket socket) {
		super();
		this.setLayout(null);
		this.setTitle("Ⱥ��");
		// �ı�
		JTextArea jl = new JTextArea();
		jl.setBounds(0, 0, 500, 300);
		jl.setBackground(Color.WHITE);
		jl.setEnabled(false);
		// JScrollPane js = new JScrollPane(jl);
		// js.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		// js.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		jl.setFont(new java.awt.Font("����", 0, 22));
		this.add(jl);
		// jl.add(js);
		// �����
		JTextField jtf = new JTextField();
		jtf.setBounds(0, 300, 500, 40);
		jtf.setFont(new java.awt.Font("����", 0, 20));
		this.add(jtf);
		// ���Ͱ�ť
		JButton jb = new JButton("����");
		jb.setBounds(200, 361, 80, 30);
		jb.setFont(new java.awt.Font("����", 0, 22));
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ȡ�û���������
				String nr = jtf.getText();

				if (!"".equals(nr)) {
					// �ҵ�socket
					try {
						PrintWriter pw = new PrintWriter(socket.getOutputStream());
						// ����
						pw.write(nr + "\n");
						pw.flush();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				// ���
				jtf.setText("");
			}
		});
		this.add(jb);
		// ��հ�ť
		JButton jb2 = new JButton("��������¼");
		jb2.setBounds(370, 420, 120, 30);
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText("");

			}
		});
		this.add(jb2);
		// ���찴ť
		JButton jb3 = new JButton("�鿴�����¼");
		jb3.setBounds(370, 360, 120, 30);
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame jf = new JFrame("�����¼");
				jf.setLayout(null);

				JTextArea jTextArea = new JTextArea();
				jTextArea.setBounds(0, 0, 500, 500);
				jTextArea.setEnabled(false);
				jTextArea.setFont(new java.awt.Font("΢���ź�", 0, 19));
				jTextArea.setForeground(Color.black);
				jTextArea.setBackground(Color.white);
				jf.add(jTextArea);
				jf.setVisible(true);
				jf.setBounds(688, 270, 500, 500);
				// ��������
				try {
					Connection cnt = MyConnection.getIntance();
					ResultSet rs = null;
					rs = cnt.createStatement().executeQuery("select * from emp");
					while (rs.next()) {
						jTextArea.setText(jTextArea.getText() /*+ "\n" + rs.getString("name") 
								+ rs.getString("post") */+ "\n" + rs.getString("shuru"));
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		this.add(jb3);
		// ��������¼
		JButton jb4 = new JButton("��������¼");
		jb4.setBounds(0, 360, 120, 30);
		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Connection cnt = MyConnection.getIntance();
					PreparedStatement ps = null;
					ps = cnt.prepareStatement("truncate table emp");
					ps.executeUpdate();
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		});
		this.add(jb4);
		// ��ʾ��ť
		JLabel jl3 = new JLabel();
		jl3.setText("��ʾ����һ������Ϊ�û���");
		jl3.setBounds(0, 420, 200, 30);
		this.add(jl3);
		new Thread(new Int(socket, jl)).start();
		this.setBounds(200, 200, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String args[]) {
		Socket socket = null;
		try {
			socket = new Socket("192.168.199.142", 1357);
			new Client(socket);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}