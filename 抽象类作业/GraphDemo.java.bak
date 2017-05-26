public class GraphDemo {
	public static void main(String[] args) {
		Circle c = new Circle(1.0);
		double d1 = c.getZhouchang();
		Graph c2 = new Circle(2.0);
		double d2 = c2.getZhouchang();
		
		Graph s = new Sanjiaoxing(3,4,5);
		double d3 = s.getZhouchang();
		
		System.out.println(d1 +"," +d2 +"," + d3);
	}
}

abstract class Graph{
	
	abstract double getZhouchang();
}

class Circle extends  Graph{
	private double r;
	public Circle(double r){
		this.r=r;
	}
	@Override
	double getZhouchang() {
		return Math.PI*r*2;
	}
}
class Sanjiaoxing extends  Graph{
	private double a;
	private double b;
	private double c;
	
	public Sanjiaoxing(double a,double b, double c){
		isSanjiaoxing(a, b, c);
	}
	
	private void isSanjiaoxing(double a,double b, double c){
		if(!true){
			
		}else{
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	
	@Override
	double getZhouchang() {
		return a + b +c;
	}
	
}
