package com.Map;
import java.util.*;
import java.util.Map.Entry;
public class MaoDemo {
	public static void main(String [] args){
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		//Map m1 = new HashMap();
		m.put(1, 45);
		m.put(5, 66);
		m.put(6, 34);
		m.put(8, 43);
		m.put(1,34);				//改/覆写
		/*
		System.out.println(m.get(5));//查看指定key的value
		System.out.println(m.containsKey(1));//查询map中是否含有指定的key有则返回true
		System.out.println(m.size());//返回Map里的key-value对的个数
		m1.putAll(m);//将指定Map中的key-value对复制到本Map中
		m.remove(1);//删指定
		m.clear();//删除全部
		m.isEmpty();//查询该Map是否为空，为空则反回true*/
		//System.out.println(m.values());//返回该Map里所有value组成的Collection；
		//System.out.println(m.keySet());//返回该Map里所有的Set集合
		/*System.out.println(m.entrySet());返回key所有key-value对组成的Set集合
		System.out.println(m);*/
		
		//遍历key-value对
		//1.通过m.keySet遍历
		//map当中数据量比较大推荐使用for  
		/*for(Object key : m.keySet()){
			System.out.println("key="+key+"\tvalue="+m.get(key));
		}*/
		//2.通过m.entrySet使用iterator遍历key和value
		/*Iterator it = m.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry e = (Entry) it.next();
			System.out.println("key="+e.getKey()+"value="+e.getValue());
			//System.out.println("key="+key+"value="+m.get(key));
		}*/
	}
}












