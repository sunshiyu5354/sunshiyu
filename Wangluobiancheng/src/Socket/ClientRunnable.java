package Socket;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientRunnable implements Runnable{
	Socket socket = null;
	List<Socket> sockes; 
	public ClientRunnable(Socket socket,List<Socket> sockes){
		this.socket = socket;
		this.sockes = sockes;
	}
	public void run(){
		while(true){
			try{
				BufferedReader buffered = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String xiaoxi = null;
				xiaoxi = buffered.readLine();
				System.out.println("�ͻ��˷�������Ϊ"+xiaoxi);
				String s = "����������"+xiaoxi;
				for(Socket socket1:sockes){
				PrintWriter printwriter = new PrintWriter(socket1.getOutputStream());
				printwriter.write(s+"\n");
				printwriter.flush( );
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
