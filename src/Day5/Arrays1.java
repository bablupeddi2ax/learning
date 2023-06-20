package Day5;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		sumAndAvgOfArray(arr,5);
	}
	public static void sumAndAvgOfArray(int[] arr,int n) {
		 for(int i = 0;i<5;i++) {
			arr[i] = i+1; 
		 }
		int sum = 0;
		float avg = 0.0f;
		for(int i:arr) {
			sum+=i;
		}
		avg = sum/arr.length;
		System.out.println("sum is " + sum   + " avg is " + avg);
	}
}
