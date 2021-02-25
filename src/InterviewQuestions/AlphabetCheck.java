package InterviewQuestions;

import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Any Character To Check Alphabet or Not: ");

		char chr = scan.next().charAt(0);
		if((chr>='a' && chr<='z')||(chr>='A' && chr<='Z')){
			System.out.println(chr+"  is an alphabet ");
		}else{
			System.out.println(chr+"  is not an alphabet ");
		}
	}
}