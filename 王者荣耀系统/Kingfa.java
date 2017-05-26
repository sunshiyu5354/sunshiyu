import java.util.Scanner;
public class Kingfa{
	static Scanner sc = new Scanner(System.in);
	static King[] kk = new King[100];
	static int i=0;
	public static void main(String args[]){
		System.out.println("王者荣耀现在有"+King.numbers+"个英雄");
		menu();
	}
	public static void menu(){
		System.out.println("请根据以下提示进行操作");
		System.out.println("--------------");
		System.out.println("1.输入英雄信息");
		System.out.println("2.删除英雄信息");
		System.out.println("3.查询英雄信息");
		System.out.println("4.修改英雄信息");
		System.out.println("5.退出操作界面");
		System.out.println("--------------");
		int cz = sc.nextInt();
		switch(cz){
			case 1:
				addKingfa();
			break;
			case 2:
				deleteKingfa();
			break;
			case 3:
				selectKingfa();
			break;
			case 4:
				updateKingfa();
			break;
			case 5:
				System.exit(0);
			break;
			default:
				System.out.println("输入有误，返回菜单");
			menu();
		}
	}
	public static void addKingfa(){
		
		boolean is = true;
		while(is){
			System.out.println("你正在录入第"+(i+1)+"英雄信息");
			System.out.print("请输入英雄名称");
			String name = sc.next();
			System.out.print("请输入英雄价格");
			int price = sc.nextInt();
			System.out.print("请输入英雄皮肤");
			String skin = sc.next();
			System.out.print("请输入皮肤价格");
			int pfprice = sc.nextInt();
			System.out.print("请输入英雄台词");
			String line = sc.next();
			System.out.print("输入成功");
			King fangfa = new King(name,price,skin,pfprice,line);
			kk[i] = fangfa;
			i++;
			System.out.println("添加成功,是否继续添加");
			System.out.println("1.继续添加");
			System.out.println("2.返回菜单");
			int cz = sc.nextInt();
			if(cz == 1){
				is = true;
			}else{
				is = false;
			}
		}
		menu();
	}
	public static void deleteKingfa(){
		System.out.print("请选择要删除的英雄信息");
		System.out.print("  1.删除全部");
		System.out.print("  2.指定删除");
		int s = sc.nextInt();
		if(s == 1){
			for(int i=0;i<kk.length;i++){
				if(kk[i] != null){
					kk[i]=null;
				}
			}
		}
		if(s == 2){
			int i=0;
			String mz = sc.next();
			 for(King k:kk){
				if(kk[i]!=null && k.name.equals(mz)){
					kk[i]=null;
				}
			}
		}
		System.out.println("删除完成，是否返回: 1.返回 2.继续删除");
			int sq = sc.nextInt();
		if(sq==1){
			menu();
		}else if(sq==2){
			deleteKingfa();
		}
	}
	public static void selectKingfa(){
		System.out.println("请选择你的查询方法");
		System.out.println("1.全部查询");
		System.out.println("2.精确查询");
		int f = sc.nextInt();
		if(f == 1){
			for(int i=0;i<100;i++){
				if(kk[i] != null){
				kk[i].say();
				}
			}
		}
		if(f == 2){
			System.out.println("请输入要查询的英雄名称");
			String mz = sc.next();
			for(King k:kk){
				if(k!=null && k.name.equals(mz)){
					k.say();
				}
			}
		}
		if(f != 1 && f != 2){
			System.out.println("输入错误，请重新输入");
			selectKingfa();
		}
		menu();
	}
	public static void updateKingfa(){
		System.out.println("请输入要更新的英雄姓名");
			String mz = sc.next();
			for(int i=0;i<kk.length;i++){
				if(kk[i]!= null && kk[i].name.equals(mz)){
					System.out.println("请输入更新后英雄信息");
					kk[i].name = sc.next();
					System.out.println("请输入更新后英雄价格");
					kk[i].price = sc.nextInt();
					System.out.println("请输入更新后英雄皮肤");
					kk[i].skin = sc.next();
					System.out.println("请输入更新后皮肤价格");
					kk[i].pfprice = sc.nextInt();
					System.out.println("请输入更新后英雄台词");
					kk[i].line = sc.next();
				}
			}
			System.out.println("更新完成，是否返回: 1.返回 2.继续更新");
			int z = sc.nextInt();
		if(z==1){
			menu();
		}else if(z==2){
			updateKingfa();
		}
	}
}