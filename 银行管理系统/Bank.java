public class Bank{
	String name;
	int password;
	String site;
	int money;
	public void Bank(String name,int password,String site,int money){
		this.name = name;
		this.password = password;
		this.site = site;
		this.money = money;
	}
	public void say(){
		System.out.print(""+name+""+password+""+site+""+money);
	}
}