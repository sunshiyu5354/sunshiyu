package com.Thread;

public class QuqianMain {
	public static void main(String args[]){
		Quqian qq = new Quqian("��ɽ",4000);
		QuqianThread ka = new QuqianThread(qq,2000);
		QuqianThread cz = new QuqianThread(qq,3000);
		new Thread(ka).start();
		new Thread(cz).start();
	}
}