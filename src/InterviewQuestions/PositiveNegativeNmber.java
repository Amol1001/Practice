package InterviewQuestions;

import java.util.Scanner;

public class PositiveNegativeNmber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Number To Check Positive or Negative: ");

		Double number = scan.nextDouble();
		
		if(number<0.0){
			System.out.println(number+"  is negative number");
		}else if(number>0.0) {
			System.out.println(number+"  is positive number");
		}else{
			System.out.println(number+" is zero");
		}
	}

}
