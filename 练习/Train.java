/*
*����
����
*����
*��վ
*�ٶ�
����
*��ʻ
*ͣ��
*/
public class Train{
	static int numbers=100;
	//��������
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
		System.out.println("����Ϊ"+hcname+"�ѵ�"+station+"�ٶ�Ϊ"+speed+"����/Сʱ "+"����"+load+"��");
	}
	//��������
	public void run(){
		System.out.println("����������ʻ��");
	}
	public void draw(){
		System.out.println("��û�е�վ");
	}
}
