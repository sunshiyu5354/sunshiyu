package com.Fanshe;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

//�Ƿ��䷽��
public class Test {
	public static void main(String args[]) throws Exception{
		//new Service1().doService1();
		//new Service2().doService2();
		File f = new File("E:\\lyfssy\\sqldemo\\src\\com\\Fanshe\\spring.txt");
		Properties s =  new Properties();
		s.load(new FileInputStream(f));
		String className = (String) s.get("class");
		String methodName = (String) s.get("method");
		
		//���������ƴ��������
		Class cl = Class.forName(className);
		//���ݷ������ƣ���ȡ����
		Method m = cl.getMethod(methodName);
		//��ȡ������
		Constructor c = cl.getConstructor();
		//���ݹ�����ʵ����������
		Object service = c.newInstance();
		//���ö����ָ������
		m.invoke(service);
	}
}