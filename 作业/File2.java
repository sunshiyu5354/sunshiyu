//׷������
package com.IO;
import java.io.*;
public class File2 {

	public static void main(String[] args) throws IOException {
		String  f1 = "D:/files"+File.separator+"du.txt";
		File f = new File(f1);
		OutputStream out = new FileOutputStream(f,true);//true��ʾ׷��ģʽ������Ϊ����
		String str = "hai";
		byte [] b = str.getBytes();
		out.write(b);
		/*for(int i=0;i<b.length;i++){
			out.write(b[i]);	
		}*/
		out.close();
	}

}
