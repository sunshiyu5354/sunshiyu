public class Cellphone{
	static int nubmers=100;
	String sjname;
	String colour;
	double size;
	int memory;
	double price;
	public Cellphone(String sjname,String colour,double size, int memory,double price){
		this.sjname = sjname;
		this.colour = colour;
		this.size = size;
		this.memory = memory;
		this.price  = price;
	}
	public void say(){
		System.out.println("�ͺ�Ϊ"+sjname+" ��ɫΪ"+colour+" �ߴ�Ϊ"+size+"��"+" �ڴ�Ϊ"+memory+"G"+" �۸�Ϊ"+price+"Ԫ");
	}
}