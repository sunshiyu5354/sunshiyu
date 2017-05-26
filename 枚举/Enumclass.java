public class Enumclass{
	public static void main(String ages[]){
		EnumDemo as = EnumDemo.ON;
		System.out.println(as);//取的是后面的值
		System.out.println(as.name());//返回枚举实例名称
		System.out.println(as.ordinal());//返回当前实例的索引
		EnumDemo[] ed = as.values();
		for (int i=0;i<ed.length;i++){
			System.out.println(ed[i]);
		}//数组
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
//定义枚举类
enum EnumDemo{
	ON,OFF,GG;
}
//使用枚举类数组
enum Color{
	RED,YELLOW,BLUE,GREEN;
	public String toString(){
		String ret = super.toString();
		switch(this){
			case RED:
			ret = "红色";
			break;
			//case YELLOW:
			//ret = "黄色";
			//break;
			case BLUE:
			ret = "蓝色";
			break;
			case GREEN:
			ret = "绿色";
			break;
			default:
				ret = "没有这个颜色";
			}
			return ret;	
	}
}
//枚举类构造方法
enum Color1{
	RED("红"),GREEN(),BULE("蓝");
	private String name;
	private Color1(String name){
		this.name = name;
		System.out.println("带参数的构造方法");
	}
	private Color1(){
		System.out.println("不带参数的构造方法");
	}
}
//枚举类实现接口
interface I{
	void show();
}
/*enum Color2 implements I{
	RED(){
		public void show(){
			System.out.println("红色");
		}
	},GREEN(){
		public void show(){
			System.out.println("绿色");
		}
	},BLUE(){
		public void show(){
			System.out.println("蓝色");
		}
	};
}*/
enum Color2 implements I{
	RED,Green,BLUE;
	public void show(){
		System.out.println("蓝色");
		System.out.println("红色");
	}
}
//枚举类的单列模式
enum Singleton{
	INSTANCE;//唯一实例
	public void print(){
		System.out.println("使用enum实现单列模式");
	}
	public static Singleton getInstance(){
		return INSTANCE;
	}
}
