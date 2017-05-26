public class B extends A{
/*public static void prt(){
System.out.println("2");
}
public B(){
System.out.println("B");
}*/
protected String value = "456";
public static void main(String[] args){
	B c = new B();
	System.out.println(c.getValue());
	}
}