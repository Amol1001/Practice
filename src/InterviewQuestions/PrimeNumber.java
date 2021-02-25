package InterviewQuestions;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=5;
		boolean flag=false;
		
		for(int i=2;i<=num/2;i++){ //i=2 bcz 2 is smallest prime number,i<=13/2 means 6 times loop start from 2-6.
			if(num%i==0){ //for non prime number
				flag=true;
				break;
			}
			
		}
		if(!flag){
			System.out.println(num+" is prime number");
		}else{
			System.out.println(num+" is not a prime number");
		}
	}

}
