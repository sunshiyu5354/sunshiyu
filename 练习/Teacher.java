public class Teacher{
	static int nubmers=20;
	String name;
	String subject;
	int age;
	char sex;
	public Teacher(String name,String subject,int age,char sex){
		this.name = name;
		this.subject = subject;
		this.age = age;
		this.sex = sex;
	}
	public void say(){
		System.out.println("我们"+name+"是教"+subject+"的"+"今年"+age+"岁了 "+"是"+sex+"的");
	}
}