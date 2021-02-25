package InterviewQuestions;

public class PowerConcept {

	//3*3*3*3=81
	public static void main(String[] args) {
		
		int base=3;
		int exponent=4;
		long rsult=1;
		
		while(exponent!=0){
			rsult *= base; //rsult*base
			--exponent;
		}
		System.out.println(rsult);
		//System.out.print(Math.pow(base, exponent));
	}

}
