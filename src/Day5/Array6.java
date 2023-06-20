package Day5;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sort();
	}
	public static void sort() {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i =1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
