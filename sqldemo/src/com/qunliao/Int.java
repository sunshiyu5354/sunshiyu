package com.qunliao;

import java.io.*;
import java.net.Socket;
import javax.swing.*;

public class Int implements Runnable {
	Socket socket;
	JTextArea jt;

	public Int(Socket socket, JTextArea jt) {
		this.socket = socket;
		this.jt = jt;
	}

	@Override
	public void run() {
		while (true) {
			// 接收服务器端返回的内容
			BufferedReader br;
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String shuru = br.readLine();
				// 显示到Label
				jt.setText(jt.getText() + "\n" + shuru);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
