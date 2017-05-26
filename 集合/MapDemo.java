import java.util.*;
public class MapDemo{
	public static void main(String args[]){
		Map<String,String> map = new HashMap<String,String>();
		//添加元素
		map.put("2","a");
		map.put("1","b");
		map.put("6","Eric");
		map.put("3","d");
		map.put("7","Eric");
		//返回hm中的元素个数
		//System.out.println("hm中的元素个数:"+map.size());
		//map.remove("1");//删除指定数据
		//map.clear();//清空所有元素
		//map.get("7");//根据键返回值
		//System.out.println(map.entrySet());//遍历
		//System.out.println(map);//查询输出
		
		Set keys = map.keySet();//得到所有的key，并保存在一个Set中
		//遍历
		Iterator  i  =  keys.iterator();
		while(i.hasNext()){
			String key = (String)i.next(); 
			String value = (String)map.get(key);
			System.out.println(key+"------"+value);//自动排序
		}
	 }
}
		 