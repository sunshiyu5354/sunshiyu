/**
��Ʒ����
����
�۸�
����
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
		System.out.println(" ��Ʒ����Ϊ:"+name+" ��Ʒ����Ϊ:"+type+" ��Ʒ�۸�Ϊ:"+price+"Ԫ"+" ����Ϊ:"+quantity);
	}
}