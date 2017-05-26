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
		System.out.println("型号为"+sjname+" 颜色为"+colour+" 尺寸为"+size+"寸"+" 内存为"+memory+"G"+" 价格为"+price+"元");
	}
}