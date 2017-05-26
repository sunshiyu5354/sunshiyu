/*
*学生类
属性
*姓名
*年龄
*性别
动作
*吃饭
*学习
*玩游戏
*/
public class Student{
	static int numbers=1000;
	//声明属性
	String name;
	int age;
	char sex;
	public Student(String name,int age,char sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void say(){
		System.out.println("我叫"+name+" 今年"+age+"岁"+sex+" 我是石猴");
	}
	//声明动作
	public void eat(){
		System.out.println("吃饱了");
	}
	public void study(){
		System.out.println("学习完");
	}
	public void play(){
		System.out.println("大闹天宫");
	}
}
