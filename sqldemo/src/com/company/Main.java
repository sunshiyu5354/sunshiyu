package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * Socket  TCP/IP协议
 *
 * */
public class Main {

    public static void main(String[] args) {
        //服务器端
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
                //读取请求信息
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
                    //。。。执行sql语句
                }
//                for(String ssss:sss){
//                    System.out.println(ssss);
//                }
                //发送响应内容
                FileInputStream fileInputStream = new FileInputStream(new File("src"+sss[0]));
                PrintStream writer = new PrintStream(client.getOutputStream());
                writer.println("HTTP/1.1 200 OK");// 返回应答消息,并结束应答
                writer.println("Content-Type:text/html");
                writer.println();// 根据 HTTP 协议, 空行将结束头信息
                byte[] buf1 = new byte[fileInputStream.available()];
                //读取文件内容到buf1数组当中。
                fileInputStream.read(buf1);
                //写入到输出流当中。
                writer.write("成龙刘凡在一起".getBytes());
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
