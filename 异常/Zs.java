import java.util.Scanner;
public class Zs{
	public static void main(String args[]){
		try{
			System.out.println(add());
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("异常信息为"+e.toString());
		}
	}
	public static int add()throws Exception{
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("请输入第一个数");
			int num1 = sc.nextInt();
			System.out.println("请输入第二个数");
			int num2 = sc.nextInt();
			return num1+num2;
		}catch(Exception e){
			throw e;
			//throw new Exception("算法运行失败");
		}
	}
}

