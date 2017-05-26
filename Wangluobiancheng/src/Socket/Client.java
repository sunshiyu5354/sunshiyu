package Socket;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
	public static void main(String args[]){
		Socket socket = null;
		try{
		socket = new Socket("192.168.199.142",5354);
		//PrintWriter printwriter  = new PrintWriter(socket.getOutputStream());
		Scanner sc = new Scanner(System.in);
		/*while(true){
			//收发进行分离  用线程
			System.out.println("请输入内容");
			String neirong = sc.next();
			System.out.println("用户输入的内容是"+neirong);
			System.out.println("正在发送");
		
			PrintWriter printwriter  = new PrintWriter(socket.getOutputStream());
			printwriter.write(neirong+"\n");
			printwriter.flush();
		
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String fanhui = bufferedReader.readLine();
			System.out.println("服务器返回消息为"+fanhui);
			}
		*/
			new Thread(new OutRunnable(socket)).start();//发
			new Thread(new InRunnable(socket)).start();//收
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
