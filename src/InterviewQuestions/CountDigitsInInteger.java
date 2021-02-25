package InterviewQuestions;

import java.util.Scanner;

public class CountDigitsInInteger {

	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=reader.nextInt();
		int count=0;
			
		while(num!=0){
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
