package InterviewQuestions;

public class InvertNumber {

	public long doInvert(long number){
		
		long invert=0;
		while(number!=0){
			invert=(invert*10)+(number%10);
			number=number/10;
		}
		return invert;
		
	}
	
	public static void main(String[] args) {
		
		long number=654321;
		InvertNumber input = new InvertNumber();
		System.out.println("input number: "+number);
		System.out.println("invert number: "+input.doInvert(number));
	}

}
