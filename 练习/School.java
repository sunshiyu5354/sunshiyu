/*
*ѧУ��
����
*ѧУ��
*ϵ
*��
*�༶
����
*�ܲ�
*�ż�
*�Ͽ�
*/
public class School{
	static int numbers=2;
	//��������
	String xxname;
	String system;
    String section;
    int bclass;
	public School(String xxname,String system,String section,int bclass){
		this.xxname = xxname;
		this.system = system;
		this.section = section;
		this.bclass = bclass;
	}
	public void say(){
		System.out.println(""+xxname+""+system+""+section+""+bclass);
	}
	//��������
	public void running(){
		System.out.println("ÿ���ܲ�");
	}
	public void recess(){
		System.out.println("����ż�");
	}
	public void opens(){
		System.out.println("��һ�Ͽ�");
	}
}
