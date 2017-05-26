package com.Fanshe;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**通过一个对象获得完整的包名和类名
 * public class TestReflect {
    public static void main(String[] args) throws Exception {
        TestReflect testReflect = new TestReflect();
        System.out.println(testReflect.getClass().getName());
        // 结果 com.Fanshe.TestReflect
    }
}
*/

/**实例化Class类对象
 * public class TestReflect{
	public static void main(String args[]) throws Exception{
		Class<?> cl1 = null;
		Class<?> cl2 = null;
		Class<?> cl3 = null;
		//一般采用这种形式
		cl1 = Class.forName("com.Fanshe.TestReflect");
		cl2 = new TestReflect().getClass();
		cl3 = TestReflect.class;
		System.out.println("类名称"+cl1.getName());
		System.out.println("类名称"+cl2.getName());
		System.out.println("类名称"+cl3.getName());
	}
}
*/

/**获取一个对象的父类和实现的接口
 * public class TestReflect implements Serializable{
	private static final long serialVersionUID = -55555555555555L;
	public static void main(String args[]) throws Exception{
		Class<?> clazz = Class.forName("com.Fanshe.TestReflect");
		//获取父类
		Class<?> parentClass = clazz.getSuperclass();
		System.out.println("clazz的父类为:"+parentClass.getName());
		//clazz的父类为:java.long.Object
		//获取所有的接口
		Class<?> intes[] = clazz.getInterfaces();
		System.out.println("clazz实现的接口有:");
		for(int i = 0;i< intes.length;i++){
			 System.out.println((i + 1) + "：" + intes[i].getName());
		}
		//clazz实现的接口有:
		//1:java.io.Serializble
	}
}
 */
/**通过反射机制实例化一个类的对象
public class TestReflect {
    public static void main(String[] args) throws Exception {
        Class<?> class1 = null;
        class1 = Class.forName("com.Fanshe.User");
        // 第一种方法，实例化默认构造方法，调用set赋值
        User user = (User) class1.newInstance();
        user.setAge(20);
        user.setName("Rollen");
        System.out.println(user);
        // 结果 User [age=20, name=Rollen]
        // 第二种方法 取得全部的构造函数 使用构造函数赋值
        Constructor<?> cons[] = class1.getConstructors();
        // 查看每个构造方法需要的参数
        for (int i = 0; i < cons.length; i++) {
            Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.print("cons[" + i + "] (");
            for (int j = 0; j < clazzs.length; j++) {
                if (j == clazzs.length - 1)
                    System.out.print(clazzs[j].getName());
                else
                    System.out.print(clazzs[j].getName() + ",");
            }
            System.out.println(")");
        }
        // 结果 
        // cons[0] (java.lang.String)
        // cons[1] (int,java.lang.String)
        // cons[2] ()
        user = (User) cons[0].newInstance("Rollen");
        System.out.println(user);
        // 结果 User [age=0, name=Rollen]
        user = (User) cons[1].newInstance(20, "Rollen");
        System.out.println(user);
        // 结果 User [age=20, name=Rollen]
    }
}
class User {
    private int age;
    private String name;
    public User() {
        super();
    }
    public User(String name) {
        super();
        this.name = name;
    }
    public User(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "User [age=" + age + ", name=" + name + "]";
    }
}
*/
public class TestReflect implements Serializable{
	private static final long serialVerdsionUID = -153566223;
	public static void main(String args[]) throws Exception{
		Class<?> clazz = Class.forName("com.Fanshe.TestReflect");
		System.out.println("本类属性");
		//获取本类全部属性
		Field[] f = clazz.getDeclaredFields();
		for (int i=0;i<f.length;i++){
			//权限修饰符
			int mo = f[i].getModifiers();
			String priv = Modifier.toString(mo);
			//属性类型
			Class<?> type = f[i].getType();
			System.out.println(priv+""+type.getName()+""+f[i].getType());
			System.out.println("实现接口或者父类的属性");
			//取得实现的接口或者父类的属性
			Field[] f1 = clazz.getFields();
			for(int j=0;j<f1.length;j++){
				//权限修饰符
				int mo1 =f1[j].getModifiers();
				String priv1 = Modifier.toString(mo1);
				//属性类型
				Class<?> type1 = f1[j].getType();
				
			}
		}
	}
}
