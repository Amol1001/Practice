package InterviewQuestions;

public class StaticNonStatic {

	static int var1 = 10;
	int var2 = 20;
	
	public static void main(String[] args) {
		
		StaticNonStatic obj = new StaticNonStatic();
		
		System.out.println(var1);
		System.out.println(obj.var2);
		

	}

}
