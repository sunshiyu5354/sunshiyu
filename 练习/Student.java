/*
*ѧ����
����
*����
*����
*�Ա�
����
*�Է�
*ѧϰ
*����Ϸ
*/
public class Student{
	static int numbers=1000;
	//��������
	String name;
	int age;
	char sex;
	public Student(String name,int age,char sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public void say(){
		System.out.println("�ҽ�"+name+" ����"+age+"��"+sex+" ����ʯ��");
	}
	//��������
	public void eat(){
		System.out.println("�Ա���");
	}
	public void study(){
		System.out.println("ѧϰ��");
	}
	public void play(){
		System.out.println("�����칬");
	}
}
