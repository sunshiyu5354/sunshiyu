import java.util.*;
public class mima{
	public static void main(String[] args){
		int a=0,b=0,c=0,d=0;
		while(d<10000){
			a=0;b=0;c=0;
			System.out.println("请输入你的密码");
			Scanner sc = new Scanner(System.in);
			String p = sc.next();
			char[] m = new char[p.length()];
			for(int i=0;i<p.length();i++){
				m[i] = p.charAt(i);
				if(m[i]>='0' && m[i]<='9'){
					a=1;
				}
				if(m[i]>='A' && m[i]<='z'){
					b=1;
				}
				if((m[i]>=33 && m[i]<=47)|| (m[i]>=58 && m[i]<=64)){
					c=1;
				}
			}
			if(a==1&&b==1&&c==1){
				System.out.println("恭喜你的密码安全等级为高级!");
			}else if((a==1&&b==1&&c!=1)||(a==1&&c==1&&b!=1)||(b==1&&c==1&&a!=1)){
				System.out.println("你的密码安全等级为中级");
			}else if((a==1&&b!=1&&c!=1)||(b==1&&a!=1&&c!=1)||(c==1&&a!=1&&b!=1)){
				System.out.println("你的密码安全等级为低级请重新设置");
			}
			d++;
		}
	}
	
}
