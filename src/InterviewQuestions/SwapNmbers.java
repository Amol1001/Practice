package InterviewQuestions;
import java.util.Scanner;

public class SwapNmbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Two Numbers: ");
		
		double number1 = scan.nextDouble();
		double number2 = scan.nextDouble();
		
		System.out.println("Before Swaping Number1: "+number1);
		System.out.println("Before Swaping Number2: "+number2);

		/*double temp;
		temp=number1;
		number1=number2;
		number2=temp;
		
		System.out.println("After Swaping Number1: "+number1);
		System.out.println("After Swaping Number2: "+number2);*/
		
		//Without using third var
		
		number1=number1-number2;
		number2=number1+number2;
		number1=number2-number1;
		
		System.out.println("After Swaping Number1: "+number1);
		System.out.println("After Swaping Number2: "+number2);
	}

}
