//Exception异常类
//try,catch,finally
public class ExceptionDemo{
	public static void main(String agrs[]){
		ExceptionDemo e = new ExceptionDemo();
		e.add();
	}
	int num3 = -1;
	public void add(){
		int num1 = 2;
		int num2 = 0;
		try{
			int num3 = num1/num2;
		//}catch(ArithmeticException a){
			//System.out.println("出现运算错误");
		}catch(Exception e){
			e.printStackTrace();
			e.getMessage();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println("捕捉大异常");
		}finally{
			System.out.println("最终处理结果");
		}
		//System.exit(1);
		System.out.println(num3);
	}
}