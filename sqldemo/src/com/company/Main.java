package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * Socket  TCP/IPЭ��
 *
 * */
public class Main {

    public static void main(String[] args) {
        //��������
        ServerSocket server = null;
        try {
            server = new ServerSocket(80);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while(true){
            try{
                Socket client = server.accept();
                byte[] buf = new byte[1024];
                //��ȡ������Ϣ
                //InputStream in = client.getInputStream();
                //in.read(buf);
                //System.out.println("request from client " + client.getInetAddress().getHostAddress());
                //System.out.println(new String(buf));
                BufferedReader  bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                String s = bufferedReader.readLine();
                String[] ss = s.split(" ");
                //ss[1] =/index.html?id=1&action=delete
                String[] sss = ss[1].split("[?]");
                String[] ssss = sss[1].split("&");
                if(ssss[1].equals("action=delete")){
                    String sql = "delete from demo where "+ssss[0];
                    //������ִ��sql���
                }
//                for(String ssss:sss){
//                    System.out.println(ssss);
//                }
                //������Ӧ����
                FileInputStream fileInputStream = new FileInputStream(new File("src"+sss[0]));
                PrintStream writer = new PrintStream(client.getOutputStream());
                writer.println("HTTP/1.1 200 OK");// ����Ӧ����Ϣ,������Ӧ��
                writer.println("Content-Type:text/html");
                writer.println();// ���� HTTP Э��, ���н�����ͷ��Ϣ
                byte[] buf1 = new byte[fileInputStream.available()];
                //��ȡ�ļ����ݵ�buf1���鵱�С�
                fileInputStream.read(buf1);
                //д�뵽��������С�
                writer.write("����������һ��".getBytes());
                writer.flush();
                writer.close();
                //in.close();
                client.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}