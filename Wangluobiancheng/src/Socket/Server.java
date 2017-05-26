package Socket;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
	public static void main(String args[]){
		ServerSocket serversocket = null;
		Socket socket = null;
		List<Socket> list = new ArrayList<Socket>();
		try{
			ServerSocket ss = new ServerSocket(5354);
			System.out.println("端口创建成功");
		while(true){
			socket = ss.accept();
			list.add(socket);
			/*BufferedReader buffered = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String xiaoxi = buffered.readLine();
			System.out.println("客户端返回内容为"+xiaoxi);
			String s = "服务器返回"+xiaoxi;
			PrintWriter printwriter = new PrintWriter(socket.getOutputStream());
			printwriter.write(s+"\n");
			printwriter.flush( );*/
			new Thread(new ClientRunnable(socket,list)).start();
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
