package Socket;

import java.io.*;
import java.net.*;
import java.util.*;

public class InRunnable implements Runnable{
	Socket socket = null;
	public InRunnable(Socket socket){
		this.socket = socket;
	}
	public void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			try{
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String fanhui = bufferedReader.readLine();
				System.out.println("服务器返回消息为"+fanhui);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
