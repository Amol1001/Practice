package InterviewQuestions;

import java.util.Scanner;

public class QuotientAndRminder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Two Integer Value: ");
		
		double number1 = scan.nextDouble();
		double number2 = scan.nextDouble();
		
		System.out.println("The Quotient Is: "+(number1/number2));
		System.out.println("The Reminder Is: "+(number1%number2));
	}

}
