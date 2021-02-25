package InterviewQuestions;

public class NumberReverse {

	public static void main(String[] args) {
		
		int number=1234;
		int reverse=0;
		
		while(number!=0){
			int num=number%10;
			reverse=reverse*10+num;
			number=number/10;
		}
		System.out.println("Reverse Number Is: "+reverse);
	}

}
