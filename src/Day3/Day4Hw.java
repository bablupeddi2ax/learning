package Day3;

public class Day4Hw {

	public static void main(String[] args) {
		//sumOfLastTwoDigits(1,2);
		System.out.println(exactMultiple(2,7));
	}
	public static void sumOfLastTwoDigits(int a , int b) {
		  
		System.out.println(a%10 + b%10);
	}
	public static int exactMultiple(int a ,int b) {
		if(a==0 || b==0) {
			return 3;
		}
		else if(b%a==0){
			return 2; 
		}
		else {
			return 1;
		}
		
	}

}
