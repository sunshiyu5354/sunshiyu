public class Computer{
	static int nubmers=100;
	String name;
	String colour;
	double size;
	int memory;
	double price;
	public Computer(String name,String colour,double size,int memory,double price){
		this.name = name;
		this.colour = colour;
		this.size = size;
		this.memory = memory;
		this.price  = price;
	}
	public void say(){
		System.out.println("型号为 "+name+" 颜色为"+colour+" 尺寸为"+size+"寸"+" 内存为"+memory+"G"+" 价格为"+price+"元");
	}
}