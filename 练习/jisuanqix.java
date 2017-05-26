import java.util.Scanner;
public class jisuanqix{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的姓名："); 
        String name = input.nextLine(); 
        System.out.println("请输入你的年龄："); 
        int age = input.nextInt(); 
        System.out.println("请输入你的工资："); 
        float salary = input.nextFloat(); 
        System.out.println("你的信息如下："); 
        System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"工资："+salary); 
	}
}