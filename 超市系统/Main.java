import java.util.Scanner;
public class Main{
	static Scanner sc = new Scanner(System.in);
	static Supermarket[] ss = new Supermarket[1000];
	static int i=0;
	public static void main(String ages[]){
		System.out.println("=====超市系统=====");
		menu();
	}
	public static void menu(){
		System.out.println("请根据以下提示进行操作");
		System.out.println("==============");
		System.out.println("1.输入商品信息");
		System.out.println("2.更新商品信息");
		System.out.println("3.查询商品信息");
		System.out.println("4.删除商品信息");
		System.out.println("5.退出操作界面");
		System.out.println("==============");
		int cz = sc.nextInt();
		switch(cz){
			case 1:
				addsp();
			break;
			case 2:
				updsp();
			break;
			case 3:
				selsp();
			break;
			case 4:
				delsp();
			break;
			case 5:
				System.exit(0);
			break;
			default:
				System.out.println("输入有误，请重新输入");
			menu();
		}
	}
	public static void addsp(){
		boolean is = true;
		while(is){
			System.out.println("你正在输入第"+(i+1)+"个商品信息");
			System.out.print("请输入商品名称");
			String name = sc.next();
			System.out.print("请输入商品类型");
			String type = sc.next();
			System.out.print("请输入商品价格");
			int price = sc.nextInt();
			System.out.print("请输入商品数量");
			int quantity = sc.nextInt();
			Supermarket cc = new Supermarket(name,type,price,quantity);
			ss[i] = cc;
			i++;
			System.out.println("添加成功，是否继续添加");
			System.out.println("  1.继续添加");
			System.out.println("  2.返回菜单");
			int cz = sc.nextInt();
			if(cz == 1){
				is = true;
			}else{
				is = false;
			}
		}
		menu();
	}
	public static void updsp(){
		System.out.println("查询你要更改的商品名称");
			String mz = sc.next();
			for(int i=0;i<ss.length;i++){
				if(ss[i] != null && ss[i].name.equals(mz)){
					System.out.println("请输入修改后的商品名称");
					ss[i].name = sc.next();
					System.out.println("请输入修改后的商品类型");
					ss[i].type = sc.next();
					System.out.println("请输入修改后的商品价格");
					ss[i].price = sc.nextInt();
					System.out.println("请输入修改后的商品数量");
					ss[i].quantity = sc.nextInt();
			}
		}
		System.out.println("更新完成，是否继续更新: 1.返回 2.继续更新");
		int g = sc.nextInt();
		if(g == 1){
			menu();
		}
		if(g == 2){
			updsp();
		}
	}
	public static void selsp(){
		System.out.println("请输入你要查询的方式");
		System.out.println("1.全部查询");
		System.out.println("2.指定查询");
		int cz = sc.nextInt();
		if(cz == 1){
			for(int i=0;i<1000;i++){
				if(ss[i] != null){
					ss[i].say();
				}
			}
		}
		if(cz == 2){
			System.out.println("请输入你要查询的商品名称");
			String mz = sc.next();
			for(int i=0;i<1000;i++){
				if(ss[i] != null&& ss[i].name.equals(mz)){
					System.out.println("查询成功");
					ss[i].say();
				}
			}
		}
		System.out.println("是否继续查询：1.返回 2.继续查询");
		int s = sc.nextInt();
		if(s == 1){
			menu();
		}else if(s == 2){
			selsp();
		}
		if(cz != 1&&cz != 2){
			System.out.println("输入错误，请重新输入");
			selsp();
		}
	}
	public static void delsp(){
		System.out.println("请选择删除方法:");
		System.out.println("1.全部删除");
		System.out.println("2.指定删除");
		int s = sc.nextInt();		
		if(s == 1){
			for(int i=0;i<ss.length;i++){
				if(ss[i] != null){
					ss[i] = null;
				}
			}
		}
		if(s == 2){
			String mz = sc.next();
			  for(int i=0;i<ss.length;i++){
				if(ss[i] != null && ss[i].name.equals(mz)){
					ss[i] = null;
				}
			}
		}
		System.out.println("删除完成，是否返回: 1.返回 2.继续删除");
			int sq = sc.nextInt();
		if(sq==1){
			menu();
		}else if(sq==2){
			delsp();
			}
	}
}