public class ColorMain{
	public static void main(String ages[]){
		//调用枚举构造器
		Color1 c =  Color1.RED;
		System.out.print("\n");
		//调用枚举接口
		Color2.RED.show();
		System.out.print("\n");
		//调用枚举实例
		Singleton.getInstance().print();
	}
}