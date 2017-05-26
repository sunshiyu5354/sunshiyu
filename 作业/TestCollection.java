package com.jjhe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestCollection {
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		@SuppressWarnings("rawtypes")
		Collection c = new ArrayList();
		c.add("孙悟空");//添加元素
		c.add(6);//同上
		System.out.println("c集合里的元素个数为:"+c.size());//查询元素个数
		c.remove(6);//删除指定元素
		System.out.println("c集合里的元素个数为:"+c.size());
		System.out.println("c集合里是否包含孙悟空字符串:"+c.contains("孙悟空"));
		//查询指定字符串 有返回true 无返回false;
		c.add("花果山水帘洞 ");
		c.add("齐天大圣");
		System.out.println("c集合里的元素："+ c);//输出元素
		@SuppressWarnings("rawtypes")
		Collection books = new HashSet();
		books.add("花果山水帘洞");
		books.add("齐天大圣");
		System.out.println("c集合是否完全包含books集合?"+ c.containsAll(books));
		c.removeAll(books);//用c集合减去books集合里的元素
		System.out.println("c集合里的元素："+ c);
		c.clear();//删除集合里的所有元素
		System.out.println("c集合里的元素："+ c);
		books.retainAll(c);//集合里只剩下c集合里也同时包含的元素
		System.out.println("books集合的元素:"+ books);
	}
}
