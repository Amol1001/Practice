package ExceptionHandling;

public class Division {

	static int div(String[] args){
		
		int res=-1;
		
		try{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			res=4;
		}catch(ArrayIndexOutOfBoundsException e){
			res=5;
		}catch(NumberFormatException e){
			res=6;
		}catch(ArithmeticException e){
			res=7;
		}
		
		System.out.println("After try/catch");
		return 0;
		
	}
		
}
