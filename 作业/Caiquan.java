package com.cyl;

public class Caiquan {
	public void ff(int a,int c){
		if(a == c){
			System.out.println("平局");
		}else{
			if(a == 1){
				if(c==2){
					System.out.println("玩家赢");
				}else{
					System.out.println("电脑赢");
				}
			}else if(a == 2){
				if(c==3){
					System.out.println("玩家赢");
				}else{
					System.out.println("电脑赢");
				}
			}else if(a == 3){
				if(c==1){
					System.out.println("玩家赢");
				}else{
					System.out.println("电脑赢");
				}
			}
		}
	}
}
