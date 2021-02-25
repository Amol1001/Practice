package InterviewQuestions;

import java.util.Scanner;

public class LargestAmongstThreeNumbers {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Number: ");
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		//first way
		
		if(x>y && x>z){
			System.out.println("X="+x+" is greatest number");
		}else if(y>z){
			System.out.println("Y="+y+" is greatest number");
		}else{
			System.out.println("Z="+z+" is greatest number");
		}
		
		//second way
		
		if(x>=y){
			if(x>=z){
				System.out.println("X="+x+" is greatest number");
			}else{
				System.out.println("Z="+z+" is greatest number");
			}
		}else{
			if(y>=z){
				System.out.println("Y="+y+" is greatest number");
			}else{
				System.out.println("Z="+z+" is greatest number");
			}
		}

	}

}
