public class Person{
	public Shouji shouji;
	public static void main(String args[]){
		String number = "15215496116";
		String dx = "hello world !";
		Shoujika shoujika = new Shoujika(number,dx);
		Shouji shouji = new Shouji(shoujika);
		Person people = new Person(shouji);
		people.say();
	}
	public Person(Shouji shouji){
		this.shouji = shouji;
	}
	public void say(){
		shouji.call();
	}
}