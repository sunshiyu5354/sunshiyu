/*
*火车类
属性
*车名
*车站
*速度
动作
*行驶
*停车
*/
public class Train{
	static int numbers=100;
	//声明属性
	String hcname;
	String station;
    int speed;
    int load;
	public Train(String hcname,String station,int speed,int load){
		this.hcname = hcname;
		this.station = station;
		this.speed = speed;
		this.load = load;
	}
	public void say(){
		System.out.println("本车为"+hcname+"已到"+station+"速度为"+speed+"公里/小时 "+"载重"+load+"吨");
	}
	//声明动作
	public void run(){
		System.out.println("本车正在行驶中");
	}
	public void draw(){
		System.out.println("还没有到站");
	}
}
