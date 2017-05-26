package com.Thread;

public class QuqianThread implements Runnable{
	private Quqian qq;
	private int money;
	public QuqianThread(Quqian qq,int money){
		this.qq = qq;
		this.money = money;
	}
	public void run(){
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		//ͬ������� ��ס����
		synchronized(qq){
			if(qq.getNumber()>=money){//�˻�����㹻
				qq.setNumber(qq.getNumber()-money);
				System.out.println("ȡǮ2000$: "+"ȡǮ�ɹ���ȡ��"+money+"$, ���:"+qq.getNumber()+"$");
			}else{
				System.out.println("ȡǮ3000$: "+"����,��ǰ���:"+qq.getNumber()+"$"+" ��"+(money-qq.getNumber())+"$");
			}
		}
	}
}
