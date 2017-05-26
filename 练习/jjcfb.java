public class jjcfb{
public static void main(String args[]){
	int a,b,c;
	c=0;
	for(a=1;a<=9;a++){
		for(b=1;b<=a;b++){
			c=a*b;
			System.out.print(b+"*"+a+"="+c+"\t");
		}
        System.out.print("\n");
    }
}
}