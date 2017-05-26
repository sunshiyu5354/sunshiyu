public class Shouji{
	public Shoujika shoujika;
	public Shouji(Shoujika shoujika){
		this.shoujika = shoujika;
	}
	public void call(){
		System.out.println("手机号码为"+shoujika.number);
		System.out.println("发送的短信为"+shoujika.dx);
	}
	}