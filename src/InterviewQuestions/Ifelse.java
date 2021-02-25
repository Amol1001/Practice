package InterviewQuestions;

import java.util.Scanner;

public class Ifelse {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter Nmber");
		int N = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2==0){
            
            System.out.println("Not Weird");
        }else{
            
            System.out.println("Weird");
        }

        scanner.close();
		

	}

}
