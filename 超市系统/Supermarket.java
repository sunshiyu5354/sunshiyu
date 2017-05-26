/**
商品名称
类型
价格
数量
*/
public class Supermarket{
	String name;
	String type;
	double price;
	int quantity;
	public Supermarket(String name,String type, double price,int quantity){
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}
	public void say(){
		System.out.println(" 商品名称为:"+name+" 商品类型为:"+type+" 商品价格为:"+price+"元"+" 数量为:"+quantity);
	}
}