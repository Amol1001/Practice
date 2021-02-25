package InterviewQuestions;

import java.util.Scanner;

public class AsciiChar {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Any Character To Find ASCII: ");
		
		int cahr = scan.next().charAt(0);
		System.out.println(cahr);
		

	}

}
