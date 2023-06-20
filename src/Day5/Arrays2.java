package Day5;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxAndMin();
	}
	public static void maxAndMin() {
		int arr[] = new int[5];
		for(int i = 0;i<5;i++) {
			arr[i] = i; 
		 }
		int max,min;
		max= arr[0];
		min = arr[0];
		for(int i =1;i<5;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("max is " +max + "min is " +min);
	}
}
