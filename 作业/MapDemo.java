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
		m.put(1,34);				//��/��д
		/*
		System.out.println(m.get(5));//�鿴ָ��key��value
		System.out.println(m.containsKey(1));//��ѯmap���Ƿ���ָ����key���򷵻�true
		System.out.println(m.size());//����Map���key-value�Եĸ���
		m1.putAll(m);//��ָ��Map�е�key-value�Ը��Ƶ���Map��
		m.remove(1);//ɾָ��
		m.clear();//ɾ��ȫ��
		m.isEmpty();//��ѯ��Map�Ƿ�Ϊ�գ�Ϊ���򷴻�true*/
		//System.out.println(m.values());//���ظ�Map������value��ɵ�Collection��
		//System.out.println(m.keySet());//���ظ�Map�����е�Set����
		/*System.out.println(m.entrySet());����key����key-value����ɵ�Set����
		System.out.println(m);*/
		
		//����key-value��
		//1.ͨ��m.keySet����
		//map�����������Ƚϴ��Ƽ�ʹ��for  
		/*for(Object key : m.keySet()){
			System.out.println("key="+key+"\tvalue="+m.get(key));
		}*/
		//2.ͨ��m.entrySetʹ��iterator����key��value
		/*Iterator it = m.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry e = (Entry) it.next();
			System.out.println("key="+e.getKey()+"value="+e.getValue());
			//System.out.println("key="+key+"value="+m.get(key));
		}*/
	}
}












