package com.io;

import java.io.File ;
import java.util.Scanner;   
import java.io.OutputStream ;    
import java.io.FileOutputStream ;    
public class OutputStreamDemo01{ 
	Scanner sc = new Scanner(System.in);
	public static void main(String args[]) throws Exception{    // 异常抛出，不处理     
        // 第1步、使用File类找到一个文件     
        File f= new File("Test.txt") ;  // 声明File对象    
        //if(f.exists()){
        //	f.delete();
        //}
        // 第2步、通过子类实例化父类对象     
        OutputStream out = null ;   // 准备好一个输出的对象     
        out = new FileOutputStream(f)  ;    // 通过对象多态性，进行实例化     
        // 第3步、进行写操作     
        String str = "Hello World!!!" ;     // 准备一个字符串     
        byte b[] = str.getBytes() ;         // 只能输出byte数组，所以将字符串变为byte数组     
        out.write(b) ;                      // 将内容输出，保存文件     
        // 第4步、关闭输出流     
        out.close() ;                       // 关闭输出流     
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

