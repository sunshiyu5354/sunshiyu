public class SnakeDemo{
	public static void main(String ages[]){
		new Snake().show();
	}
}
class Snake{
	private String name = "�ⲿ������";
	private class Node{
		private String name = "�ڲ�������";
		public void fangfa(){
			String name = "�ֲ�����";
			System.out.println("��"+name+"��ӵ�β��");
			System.out.println("��"+this.name+"��ӵ�β��");
			System.out.println("��"+Snake.this.name+"��ӵ�β��");
		}
	}
	public void show(){
		new	Node().fangfa();
	}
}