package com.io;

import java.io.File ;
import java.util.Scanner;   
import java.io.OutputStream ;    
import java.io.FileOutputStream ;    
public class OutputStreamDemo01{ 
	Scanner sc = new Scanner(System.in);
	public static void main(String args[]) throws Exception{    // �쳣�׳���������     
        // ��1����ʹ��File���ҵ�һ���ļ�     
        File f= new File("Test.txt") ;  // ����File����    
        //if(f.exists()){
        //	f.delete();
        //}
        // ��2����ͨ������ʵ�����������     
        OutputStream out = null ;   // ׼����һ������Ķ���     
        out = new FileOutputStream(f)  ;    // ͨ�������̬�ԣ�����ʵ����     
        // ��3��������д����     
        String str = "Hello World!!!" ;     // ׼��һ���ַ���     
        byte b[] = str.getBytes() ;         // ֻ�����byte���飬���Խ��ַ�����Ϊbyte����     
        out.write(b) ;                      // ����������������ļ�     
        // ��4�����ر������     
        out.close() ;                       // �ر������     
        System.out.println("name:"+f.getName());
        System.out.println("path:"+f.getAbsolutePath());
        System.out.println("name:"+f.getPath());
        System.out.println("length:"+f.length());
        System.out.println("parent:"+f.getParent());
      /*File file = new File("Test.txt");
        String[] strings = file.list();
        File[] strings = file.listFiles();
    	for(File s:strings){
    		if(s.isDirectory()){
    			s.listFiles();
    		}else{
    			System.out.println(s.getAbsolutePath());
    		}
    	}*/
    }  
}

