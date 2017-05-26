package com.Url;

import java.io.*;
import java.net.*;
import java.util.*;

public class Tulingjqr {
	public static void main(String args[]){
		
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("你要说啥:");
			String user = sc.next();
			String url = "http://www.tuling123.com/openapi/api?key=ddd09981d30846919786fd3d028bffcb&info="+user;
			//String url = "http://www.tuling123.com/openapi/api"+user;
			try{
				//创建URL对象
				URL url1 = new URL(url);
				//打开URL
				URLConnection urlConnection = url1.openConnection();
				//发起请求链接
				urlConnection.connect();		
				//获取返回内容
			
				//下载图片
				//InputStream inputStream = urlConnection.getInputStream();
				//byte[] b = new byte[1024];
				//int len = 0;
				//File f = new File("1.jpg");
				//FileOutputStream fileOutputStream = new FileOutputStream(f);
				//while((len = inputStream.read(b))!=-1){
					//fileOutputStream.write(b,0,len);
				//}
				//System.out.println("下载完成");
			
				//读取原文件
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
				StringBuffer stringbuffer = new StringBuffer();
				//String s = "";
				//while((s=bufferedReader.readLine())!=""){
					//stringbuffer.append(s);
				//}
				System.out.println(bufferedReader.readLine());
				//bufferedReader.readLine();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
