package Day5;

import java.util.Scanner;

public class Array13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][]  a = new int[2][2];
		int k = 0;
		for(int i =0;i<2;i++) {
			for(int j =0;j<2;j++) {
				a[i][j] = Integer.parseInt(args[k]);
				k++;
			}
		}
		reverseArray(a);
	}
	public static void reverseArray(int[][] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n/2; i++) {
	        for (int j = 0; j < n; j++) {
	            int temp = arr[i][j];
	            arr[i][j] = arr[n-i-1][j];
	            arr[n-i-1][j] = temp;
	        }
	    }
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.println(arr[i][j]);
	        }
	    } 
	}

}
