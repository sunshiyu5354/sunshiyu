public class Zoo{
	public static void main(String args[]){
		Dog erha = new ErHa();
		Dog taidi = new TaiDi();
		wg(erha);
		wg(taidi);
	}
	public static void wg(Dog dog){
		System.out.println("ÍæÒ»»á");
		if(dog instanceof ErHa){
			((ErHa)dog).bq();
		}
		if(dog instanceof TaiDi){
			((TaiDi)dog).bq();
		}
		dog.eat();
	}
}
