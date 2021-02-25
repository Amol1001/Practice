package InterviewQuestions;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		// !5 = 5*4*3*2*1 = 120
		// !0 = 1
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number to calculate sum: ");

		int number = scan.nextInt();
		int fact = 1;
		int fact1 = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("factorial is: " + fact);
		int j = 1;

		// second way
		while (j <= number) {
			fact1 = fact1 * j;
			j++;
		}
		System.out.println("factorial is: " + fact1);
	}

}
