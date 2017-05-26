public class ExceptionTest4
{
    public static void main(String[] args){
        try{
            ExceptionTest4 test = new ExceptionTest4();
            test.method(null);

        }
        catch (MyException e){
            e.printStackTrace();
        }    
        

    }

	 public void method(String str) throws MyException{
        if (null == str){
            throw new MyException("传入的字符串参数不能为null！");
        }else if(str.equals("$")){
			throw new MyException("不能穿入非法字符");
		}
        else{
            System.out.println(str);
        }
    }
}
 class MyException extends Exception{
    public MyException() {
        super();
    }    
    public MyException(String message){
        super(message);
    }
}