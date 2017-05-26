/* 
 Map���ϣ��ü��ϴ洢��(K)ֵ(V)��,һ��һ����棬����Ҫ��֤����Ψһ�ԡ� 
    1������ 
        put(K key,V value) 
        putAll(Map<? extends K,? extends V> m) 
    2��ɾ�� 
        clear() 
        remove(Object key) 
    3���ж� 
        containsValue(Object value) 
        containsKey(Object key) 
        isEmpty() 
    4����ȡ 
        get(Object key) 
        siza() 
        values() 
*/
package com.Map;

import java.util.Collection;  
import java.util.HashMap;  
import java.util.Map;  
public class MapDemo {  
    public static void main(String[] args) {  
        Map<Integer,String> map=new HashMap<Integer,String>();  
          
        //����Ԫ��  
        map.put(20134316, "����ΰ");  
        map.put(20134314, "ţ��ΰ");  
        map.put(20134313, "������");  
        map.put(20134311, "��     ��");  
        //������Ԫ��ʱ�����������ͬ�ļ�����ô�����ӵ�ֵ�Ḳ��ԭ�м���Ӧ��ֵ��value����  
        //����put�����᷵�ر����ǵ�ֵ��  
        map.put(20134311, "ɵ�϶�");  
        map.put(20134309, "������");  
        map.put(20134318, "�����");  
          
        System.out.println(map);//��ȡmap���������е�ֵ    
        Collection<String> coll=map.values();  
        System.out.println("map�����е�valueֵΪ��");  
        System.out.println(coll);  
        int key=20134316;  
        if(map.containsKey(key))  
            System.out.println("���ڣ�"+map.get(key));  
        System.out.println("containsKey:"+map.containsKey(20134316));  
        map.put(20134311, "��     ��");  
        System.out.println("������Ԫ�غ�map����Ϊ��");  
        System.out.println(map);  
        System.out.println("get:"+map.get(20134314));  
        //����ͨ��get()�����ķ���ֵ���ж�һ�����Ƿ���ڣ�ͨ������null���жϡ�  
        System.out.println("get:"+map.get(20134319));  
        System.out.println("remove:"+map.remove(20134311));  
        System.out.println(map);  
    }  
}  