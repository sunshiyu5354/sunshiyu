public class Enumclass{
	public static void main(String ages[]){
		EnumDemo as = EnumDemo.ON;
		System.out.println(as);//ȡ���Ǻ����ֵ
		System.out.println(as.name());//����ö��ʵ������
		System.out.println(as.ordinal());//���ص�ǰʵ��������
		EnumDemo[] ed = as.values();
		for (int i=0;i<ed.length;i++){
			System.out.println(ed[i]);
		}//����
		Color[] cs = Color.values();
		/*for (Color c : cs){
			System.out.println(c);
		}
		*/
		for (int i=0;i<cs.length;i++){
			System.out.println(cs[i]);
		}
	}
}
//����ö����
enum EnumDemo{
	ON,OFF,GG;
}
//ʹ��ö��������
enum Color{
	RED,YELLOW,BLUE,GREEN;
	public String toString(){
		String ret = super.toString();
		switch(this){
			case RED:
			ret = "��ɫ";
			break;
			//case YELLOW:
			//ret = "��ɫ";
			//break;
			case BLUE:
			ret = "��ɫ";
			break;
			case GREEN:
			ret = "��ɫ";
			break;
			default:
				ret = "û�������ɫ";
			}
			return ret;	
	}
}
//ö���๹�췽��
enum Color1{
	RED("��"),GREEN(),BULE("��");
	private String name;
	private Color1(String name){
		this.name = name;
		System.out.println("�������Ĺ��췽��");
	}
	private Color1(){
		System.out.println("���������Ĺ��췽��");
	}
}
//ö����ʵ�ֽӿ�
interface I{
	void show();
}
/*enum Color2 implements I{
	RED(){
		public void show(){
			System.out.println("��ɫ");
		}
	},GREEN(){
		public void show(){
			System.out.println("��ɫ");
		}
	},BLUE(){
		public void show(){
			System.out.println("��ɫ");
		}
	};
}*/
enum Color2 implements I{
	RED,Green,BLUE;
	public void show(){
		System.out.println("��ɫ");
		System.out.println("��ɫ");
	}
}
//ö����ĵ���ģʽ
enum Singleton{
	INSTANCE;//Ψһʵ��
	public void print(){
		System.out.println("ʹ��enumʵ�ֵ���ģʽ");
	}
	public static Singleton getInstance(){
		return INSTANCE;
	}
}
