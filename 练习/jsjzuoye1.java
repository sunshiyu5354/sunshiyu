import java.util.Scanner;
public class jsjzuoye1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a=sc.nextInt();
		System.out.println("请输入第二个数");
		int b=sc.nextInt();
		System.out.println("运算结果为:"+a+"+"+b+"="+(a+b));
		System.out.println("请输入第一个数");
		int c=sc.nextInt();
		System.out.println("请输入第二个数");
		int d=sc.nextInt();
		System.out.println("运算结果为:"+c+"-"+d+"="+(c-d));
		System.out.println("请输入第一个数");
		int e=sc.nextInt();
		System.out.println("请输入第二个数");
		int f=sc.nextInt();
		System.out.println("运算结果为:"+e+"*"+f+"="+(e*f));
		System.out.println("请输入第一个数");
		int x=sc.nextInt();
		System.out.println("请输入第二个数");
		int n=sc.nextInt();
		System.out.println("运算结果为:"+x+"/"+n+"="+((double)x/n));
	}
}