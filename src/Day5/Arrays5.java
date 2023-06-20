package Day5;

import java.util.Scanner;

public class Arrays5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		largest2AndSmallest2(arr);
	}
	public static void largest2AndSmallest2(int arr[]) {
		int l1,l2,s1,s2;
		for(int i =1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		l1 = arr[arr.length-1];
		l2 = arr[arr.length-2];
		s1 = arr[0];
		s2 = arr[1];
		
		
		System.out.println("largest 2 numbers are:" + l1 + " " + l2);
		System.out.println("smallest 2 numbers are:" + s1 + " "+ s2);
	}

}
