import java.util.Scanner;
public class ExceptionDemo4{
	public static void main(String args []){
		ExceptionDemo4 v = new ExceptionDemo4();
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("������߳�a");
		int a = sc.nextInt();
		System.out.println("������߳�b");
		int b = sc.nextInt();
		System.out.println("��������߳�c");
		int c = sc.nextInt();
		v.sanjiao(a,b,c);
		}catch(Exception c){
			c.printStackTrace();
		}
	}
	public void sanjiao(int a,int b,int c) throws Exception{
		if(a+b>c && a+c>b && b+c>a && a-b<c && a-c<b && b-c<a){
				System.out.print(a+","+b+","+c+",���Թ���������");
		}else if(a == 0 || b == 0 || c == 0){
			throw new Exception("�߳�������Ϊ0");
		}else{
			throw new Exception("a,b,c���ܹ���������");
		}
	}
}