import java.util.Scanner;
public class ExceptionDemo4{
	public static void main(String args []){
		ExceptionDemo4 v = new ExceptionDemo4();
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("请输入边长a");
		int a = sc.nextInt();
		System.out.println("请输入边长b");
		int b = sc.nextInt();
		System.out.println("请输入最长边长c");
		int c = sc.nextInt();
		v.sanjiao(a,b,c);
		}catch(Exception c){
			c.printStackTrace();
		}
	}
	public void sanjiao(int a,int b,int c) throws Exception{
		if(a+b>c && a+c>b && b+c>a && a-b<c && a-c<b && b-c<a){
				System.out.print(a+","+b+","+c+",可以构成三角形");
		}else if(a == 0 || b == 0 || c == 0){
			throw new Exception("边长不可以为0");
		}else{
			throw new Exception("a,b,c不能构成三角形");
		}
	}
}