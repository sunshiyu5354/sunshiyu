package Socket;

import java.io.*;
import java.net.*;
import java.util.*;

public class OutRunnable implements Runnable{
	Socket socket = null;
	public OutRunnable(Socket socket){
		this.socket = socket;
	}
	public void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			try{
			System.out.println("����������");
			String neirong = sc.next();
			System.out.println("�û������������"+neirong);
			System.out.println("���ڷ���");
	
			PrintWriter printwriter  = new PrintWriter(socket.getOutputStream());
			printwriter.write(neirong+"\n");
			printwriter.flush();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
