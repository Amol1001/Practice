package InterviewQuestions;

import java.util.Scanner;

public class NaturalNumberSum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number to calculate sum: ");

		int number = scan.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++){
			sum=sum+i;
		}
		System.out.println("Sum is "+sum);
	}

}
