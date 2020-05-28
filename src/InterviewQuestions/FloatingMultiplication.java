package InterviewQuestions;

import java.util.Scanner;

public class FloatingMultiplication {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Two Floating Value: ");
		
		Float number1 = scan.nextFloat();
		Float number2 = scan.nextFloat();
		
		System.out.println("The product is: "+(number1*number2));

	}

}
