import java.util.Scanner;
public class jisuanqi{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("���׼�����");
	System.out.println("*\t\t\t\t\t*");
	System.out.println("* ʹ��˵���� 1.�ӷ�  2.����  3.�˷�  4.����   *");
	System.out.println("*\t\t\t\t\t*");
	for(int i=0;i<100;i++){
	System.out.print("\n��ѡ���������");
	int num = input.nextInt();
	switch(num){
	case 1:
	System.out.println("\n******��ѡ���˼ӷ�\n");
	System.out.print("�������1������:");
	int jiashu1 = input.nextInt();
	System.out.print("�������2������:");
	int jiashu2 = input.nextInt();
	System.out.println("������Ϊ:" + jiashu1 + " + " + jiashu2 + " = " + (jiashu1 + jiashu2));
	break;
	case 2:
	System.out.println("\n******��ѡ���˼���\n");
	System.out.print("�����뱻����:");
	int jianshu1 = input.nextInt();
	System.out.print("���������:");
	int jianshu2 = input.nextInt();
	System.out.println("������Ϊ:" + jianshu1 + " - " + jianshu2 + " = " + (jianshu1 - jianshu2));
	break;
	case 3:
	System.out.println("\n******��ѡ���˳˷�\n");
	System.out.print("�������1������:");
	int chengfa1 = input.nextInt();
	System.out.print("�������2������:");
	int chengfa2 = input.nextInt();
	System.out.println("������Ϊ:" + chengfa1 + " * " + chengfa2 + " = " + (chengfa1 * chengfa2));
	break;
	case 4:
	System.out.println("\n******��ѡ���˳���\n");
	System.out.print("�����뱻����:");
	double chufa1 = input.nextInt();
	System.out.print("���������:");
	double chufa2 = input.nextInt();
	System.out.println("������Ϊ:" + chufa1 + " / " + chufa2 + " = " + (chufa1 / chufa2) + " �� " + (chufa1 % chufa2));
	break;
	default:
	System.out.println("\n���ѡ���д�������ѡ��!");
	break;
			}
		}
	}
}

		