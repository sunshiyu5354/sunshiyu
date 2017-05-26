public class FactoryDemo{
	public static void main(String ages[]){
	//ICellPhone p = new HTC();
	ICellPhone p = Factory.getInstance("htc");
	}
}
//�ֻ���׼
interface ICellPhone{
	void sendMsg();
}
//htc�ֻ�
class HTC implements ICellPhone{
	public void sendMsg(){
		System.out.println("����htc�ֻ�");
	}
}
//IPhone�ֻ�
class IPhone implements ICellPhone{
	public void sendMsg(){
		System.out.println("����IPhone�ֻ�");
	}
}
//�ֻ�����
class Factory{
	public static ICellPhone getInstance(String type){
		ICellPhone phone = null;
		if("htc".equalsIgnoreCase(type)){
			phone = new HTC();
		}else if ("iphone".equalsIgnoreCase(type)){
			phone = new IPhone();
		}
		return phone;
	}
}
