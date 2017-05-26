public class runnian{
public static void main(String ages[]){
		int i;
	for(i=2000; i<=2500; i++) {
		if(i%4==0 && i%100!=0 || i%400==0) {
			System.out.print(i+"是闰年\t");
		} else {
			System.out.print(i+"不是闰年\t");
		}
	}
}
}