package Day3;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initiaze array and print suma nd avg of array
		int size = 5;
		int[] arr = new int[size];
		maxAndMin();
		int[] a = new int[5];
		System.out.print(search(a,1));

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
	
	public static int search(int[] arr,int key) {
		for(int i = 0;i<5;i++) {
			arr[i] =i;
		}
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==key)
			return i;
		}
		return -1;
	}
	}
