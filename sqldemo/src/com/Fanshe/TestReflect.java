package com.Fanshe;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**ͨ��һ�������������İ���������
 * public class TestReflect {
    public static void main(String[] args) throws Exception {
        TestReflect testReflect = new TestReflect();
        System.out.println(testReflect.getClass().getName());
        // ��� com.Fanshe.TestReflect
    }
}
*/

/**ʵ����Class�����
 * public class TestReflect{
	public static void main(String args[]) throws Exception{
		Class<?> cl1 = null;
		Class<?> cl2 = null;
		Class<?> cl3 = null;
		//һ�����������ʽ
		cl1 = Class.forName("com.Fanshe.TestReflect");
		cl2 = new TestReflect().getClass();
		cl3 = TestReflect.class;
		System.out.println("������"+cl1.getName());
		System.out.println("������"+cl2.getName());
		System.out.println("������"+cl3.getName());
	}
}
*/

/**��ȡһ������ĸ����ʵ�ֵĽӿ�
 * public class TestReflect implements Serializable{
	private static final long serialVersionUID = -55555555555555L;
	public static void main(String args[]) throws Exception{
		Class<?> clazz = Class.forName("com.Fanshe.TestReflect");
		//��ȡ����
		Class<?> parentClass = clazz.getSuperclass();
		System.out.println("clazz�ĸ���Ϊ:"+parentClass.getName());
		//clazz�ĸ���Ϊ:java.long.Object
		//��ȡ���еĽӿ�
		Class<?> intes[] = clazz.getInterfaces();
		System.out.println("clazzʵ�ֵĽӿ���:");
		for(int i = 0;i< intes.length;i++){
			 System.out.println((i + 1) + "��" + intes[i].getName());
		}
		//clazzʵ�ֵĽӿ���:
		//1:java.io.Serializble
	}
}
 */
/**ͨ���������ʵ����һ����Ķ���
public class TestReflect {
    public static void main(String[] args) throws Exception {
        Class<?> class1 = null;
        class1 = Class.forName("com.Fanshe.User");
        // ��һ�ַ�����ʵ����Ĭ�Ϲ��췽��������set��ֵ
        User user = (User) class1.newInstance();
        user.setAge(20);
        user.setName("Rollen");
        System.out.println(user);
        // ��� User [age=20, name=Rollen]
        // �ڶ��ַ��� ȡ��ȫ���Ĺ��캯�� ʹ�ù��캯����ֵ
        Constructor<?> cons[] = class1.getConstructors();
        // �鿴ÿ�����췽����Ҫ�Ĳ���
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
        // ��� 
        // cons[0] (java.lang.String)
        // cons[1] (int,java.lang.String)
        // cons[2] ()
        user = (User) cons[0].newInstance("Rollen");
        System.out.println(user);
        // ��� User [age=0, name=Rollen]
        user = (User) cons[1].newInstance(20, "Rollen");
        System.out.println(user);
        // ��� User [age=20, name=Rollen]
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
		System.out.println("��������");
		//��ȡ����ȫ������
		Field[] f = clazz.getDeclaredFields();
		for (int i=0;i<f.length;i++){
			//Ȩ�����η�
			int mo = f[i].getModifiers();
			String priv = Modifier.toString(mo);
			//��������
			Class<?> type = f[i].getType();
			System.out.println(priv+""+type.getName()+""+f[i].getType());
			System.out.println("ʵ�ֽӿڻ��߸��������");
			//ȡ��ʵ�ֵĽӿڻ��߸��������
			Field[] f1 = clazz.getFields();
			for(int j=0;j<f1.length;j++){
				//Ȩ�����η�
				int mo1 =f1[j].getModifiers();
				String priv1 = Modifier.toString(mo1);
				//��������
				Class<?> type1 = f1[j].getType();
				
			}
		}
	}
}
