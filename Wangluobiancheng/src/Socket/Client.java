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
			//�շ����з���  ���߳�
			System.out.println("����������");
			String neirong = sc.next();
			System.out.println("�û������������"+neirong);
			System.out.println("���ڷ���");
		
			PrintWriter printwriter  = new PrintWriter(socket.getOutputStream());
			printwriter.write(neirong+"\n");
			printwriter.flush();
		
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String fanhui = bufferedReader.readLine();
			System.out.println("������������ϢΪ"+fanhui);
			}
		*/
			new Thread(new OutRunnable(socket)).start();//��
			new Thread(new InRunnable(socket)).start();//��
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
