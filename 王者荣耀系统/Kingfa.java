import java.util.Scanner;
public class Kingfa{
	static Scanner sc = new Scanner(System.in);
	static King[] kk = new King[100];
	static int i=0;
	public static void main(String args[]){
		System.out.println("������ҫ������"+King.numbers+"��Ӣ��");
		menu();
	}
	public static void menu(){
		System.out.println("�����������ʾ���в���");
		System.out.println("--------------");
		System.out.println("1.����Ӣ����Ϣ");
		System.out.println("2.ɾ��Ӣ����Ϣ");
		System.out.println("3.��ѯӢ����Ϣ");
		System.out.println("4.�޸�Ӣ����Ϣ");
		System.out.println("5.�˳���������");
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
				System.out.println("�������󣬷��ز˵�");
			menu();
		}
	}
	public static void addKingfa(){
		
		boolean is = true;
		while(is){
			System.out.println("������¼���"+(i+1)+"Ӣ����Ϣ");
			System.out.print("������Ӣ������");
			String name = sc.next();
			System.out.print("������Ӣ�ۼ۸�");
			int price = sc.nextInt();
			System.out.print("������Ӣ��Ƥ��");
			String skin = sc.next();
			System.out.print("������Ƥ���۸�");
			int pfprice = sc.nextInt();
			System.out.print("������Ӣ��̨��");
			String line = sc.next();
			System.out.print("����ɹ�");
			King fangfa = new King(name,price,skin,pfprice,line);
			kk[i] = fangfa;
			i++;
			System.out.println("��ӳɹ�,�Ƿ�������");
			System.out.println("1.�������");
			System.out.println("2.���ز˵�");
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
		System.out.print("��ѡ��Ҫɾ����Ӣ����Ϣ");
		System.out.print("  1.ɾ��ȫ��");
		System.out.print("  2.ָ��ɾ��");
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
		System.out.println("ɾ����ɣ��Ƿ񷵻�: 1.���� 2.����ɾ��");
			int sq = sc.nextInt();
		if(sq==1){
			menu();
		}else if(sq==2){
			deleteKingfa();
		}
	}
	public static void selectKingfa(){
		System.out.println("��ѡ����Ĳ�ѯ����");
		System.out.println("1.ȫ����ѯ");
		System.out.println("2.��ȷ��ѯ");
		int f = sc.nextInt();
		if(f == 1){
			for(int i=0;i<100;i++){
				if(kk[i] != null){
				kk[i].say();
				}
			}
		}
		if(f == 2){
			System.out.println("������Ҫ��ѯ��Ӣ������");
			String mz = sc.next();
			for(King k:kk){
				if(k!=null && k.name.equals(mz)){
					k.say();
				}
			}
		}
		if(f != 1 && f != 2){
			System.out.println("�����������������");
			selectKingfa();
		}
		menu();
	}
	public static void updateKingfa(){
		System.out.println("������Ҫ���µ�Ӣ������");
			String mz = sc.next();
			for(int i=0;i<kk.length;i++){
				if(kk[i]!= null && kk[i].name.equals(mz)){
					System.out.println("��������º�Ӣ����Ϣ");
					kk[i].name = sc.next();
					System.out.println("��������º�Ӣ�ۼ۸�");
					kk[i].price = sc.nextInt();
					System.out.println("��������º�Ӣ��Ƥ��");
					kk[i].skin = sc.next();
					System.out.println("��������º�Ƥ���۸�");
					kk[i].pfprice = sc.nextInt();
					System.out.println("��������º�Ӣ��̨��");
					kk[i].line = sc.next();
				}
			}
			System.out.println("������ɣ��Ƿ񷵻�: 1.���� 2.��������");
			int z = sc.nextInt();
		if(z==1){
			menu();
		}else if(z==2){
			updateKingfa();
		}
	}
}