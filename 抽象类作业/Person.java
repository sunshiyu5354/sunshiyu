public class Person{
	public static void main(String args[]){
		Artman w = new Artman();
		w.eat();
		w.set();
		NormalMan p = new NormalMan();
		p.eat();
		p.set();
	}
}
		abstract class Personn{
			abstract void eat();
			abstract void set();
		}
		class Artman extends Personn{
			public void eat(){
				System.out.println("文艺青年吃饭很慢");
			}
			public void set(){
				System.out.println("文艺青年坐姿 端坐");
			}
		}
		class NormalMan extends Personn{
			public void eat(){
				System.out.println("普通青年吃饭很快");
			}
			public void set(){
				System.out.println("普通青年翘着二郎腿");
			}
		}
