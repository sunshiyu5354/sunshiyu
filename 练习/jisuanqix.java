import java.util.Scanner;
public class jisuanqix{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("���������������"); 
        String name = input.nextLine(); 
        System.out.println("������������䣺"); 
        int age = input.nextInt(); 
        System.out.println("��������Ĺ��ʣ�"); 
        float salary = input.nextFloat(); 
        System.out.println("�����Ϣ���£�"); 
        System.out.println("������"+name+"\n"+"���䣺"+age+"\n"+"���ʣ�"+salary); 
	}
}