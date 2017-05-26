import java.util.Scanner;
public class mapaofa{
	public static void main(String ages[]){
		Scanner sc = new Scanner(System.in);
		int [] a = new int[10];
		int i,j,t;
		System.out.print("请输入10个数\n");
		
		for(i=0; i<10; i++);
		int b = sc.nextInt();
		System.out.print("\n");
		for(j=0; j<9; j++)
		for(i=0; i<9-j; i++)
			if(a[i]>a[i+1]) {
				t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		System.out.print("运行结果为\n");
		for(i=0; i<10; i++)
		System.out.print(a[i]);
		System.out.print("\n");
	}
}