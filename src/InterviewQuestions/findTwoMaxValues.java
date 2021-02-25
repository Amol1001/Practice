package InterviewQuestions;

public class findTwoMaxValues {

	public static void getTwoMaxValues(int[] nums){
		
	int maxOne = 0;
	int maxTwo = 0;
	
	for(int n:nums){
		if(maxOne<n){
			maxTwo = maxOne;
			maxOne = n;
		}else if(maxTwo<n){
			maxTwo = n;
		}
	}
	
	System.out.println("MAX ONE :"+maxOne);
	System.out.println("MAX TWO :"+maxTwo);
	
	}
		
	public static void main(String[] args) {
		
		int[] list = {12, 56, 03, 17, 47, 108, 37, 28};
		getTwoMaxValues(list);

	}
}