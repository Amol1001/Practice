package InterviewQuestions;

import java.util.Scanner;

public class ArgumentLength {

	public static void main(String[] args) {
		
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Any Argument: ");
		
		String input = scan.next();
		
			System.out.println("Argument Length: "+input.length());
	}

}
