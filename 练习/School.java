/*
*学校类
属性
*学校名
*系
*部
*班级
动作
*跑操
*放假
*上课
*/
public class School{
	static int numbers=2;
	//声明属性
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
	//声明动作
	public void running(){
		System.out.println("每天跑操");
	}
	public void recess(){
		System.out.println("周五放假");
	}
	public void opens(){
		System.out.println("周一上课");
	}
}
