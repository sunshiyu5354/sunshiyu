package com.jjhe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestCollection {
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		@SuppressWarnings("rawtypes")
		Collection c = new ArrayList();
		c.add("�����");//���Ԫ��
		c.add(6);//ͬ��
		System.out.println("c�������Ԫ�ظ���Ϊ:"+c.size());//��ѯԪ�ظ���
		c.remove(6);//ɾ��ָ��Ԫ��
		System.out.println("c�������Ԫ�ظ���Ϊ:"+c.size());
		System.out.println("c�������Ƿ����������ַ���:"+c.contains("�����"));
		//��ѯָ���ַ��� �з���true �޷���false;
		c.add("����ɽˮ���� ");
		c.add("�����ʥ");
		System.out.println("c�������Ԫ�أ�"+ c);//���Ԫ��
		@SuppressWarnings("rawtypes")
		Collection books = new HashSet();
		books.add("����ɽˮ����");
		books.add("�����ʥ");
		System.out.println("c�����Ƿ���ȫ����books����?"+ c.containsAll(books));
		c.removeAll(books);//��c���ϼ�ȥbooks�������Ԫ��
		System.out.println("c�������Ԫ�أ�"+ c);
		c.clear();//ɾ�������������Ԫ��
		System.out.println("c�������Ԫ�أ�"+ c);
		books.retainAll(c);//������ֻʣ��c������Ҳͬʱ������Ԫ��
		System.out.println("books���ϵ�Ԫ��:"+ books);
	}
}
