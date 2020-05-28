package InterviewQuestions;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Number: ");
		
		int number1 = scan.nextInt();
		
		if(number1%2==0){
			
			System.out.println(number1+" Number is even");
		}
		else{
			
			System.out.println(number1+" Number is odd");
		}
		
	}

}
