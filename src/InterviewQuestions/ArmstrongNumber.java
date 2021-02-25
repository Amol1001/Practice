package InterviewQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
		//371
		
		int num=371;
		int actualnum=num;
		double result=0;
		
		while(actualnum!=0){
			int n=actualnum%10;
			result=result+Math.pow(n, 3);
			actualnum=actualnum/10;
		}
		if(result==num){
			System.out.println(num+" is an armstrong number");
		}else{
			System.out.println(num+" is not an armstrong number");
		}

	}

}
