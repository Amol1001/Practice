package InterviewQuestions;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number: ");

		int number = scan.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(number+" X "+i+" = "+(number*i));
		}

	}

}
