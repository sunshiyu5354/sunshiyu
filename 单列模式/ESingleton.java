public class ESingleton{
	//保存该类对象的一个实例，声明的同时并初始化对象
	public static ESingleton instance = new ESingleton();
	//将构造函数私有化，不对外提供构造函数
	private ESingleton(){
	}
	//向外提供访问该类对象的方法
	public static ESingleton getInstance(){
		return instance;
	}
}