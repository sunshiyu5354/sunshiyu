import java.util.Scanner;
public class Zs{
	public static void main(String args[]){
		try{
			System.out.println(add());
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("�쳣��ϢΪ"+e.toString());
		}
	}
	public static int add()throws Exception{
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("�������һ����");
			int num1 = sc.nextInt();
			System.out.println("������ڶ�����");
			int num2 = sc.nextInt();
			return num1+num2;
		}catch(Exception e){
			throw e;
			//throw new Exception("�㷨����ʧ��");
		}
	}
}

