package InterviewQuestions;

public class Pallindrom {

	public static void main(String[] args) {
		
		
		int num=121;
		int rev=0;	
		int actnumber=num;
		
		while(num!=0){
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		System.out.println(rev);
		if(actnumber==rev){
			System.out.println(actnumber+"  is a pallindrom");
		}else{
			System.out.println(actnumber+"  is not a pallindrom");
		}
	}

}
