package Sunday;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,1,2,14,3,3};
		//1,1,2,2,3,3,14
		//duplicates(arr);
		printUNique(arr);
		//printDuplicatesUnsortedArr(arr);
//		printUniqueUnsorted(arr);
		//remDupHash(arr);
//		uniqueArrHash(arr);
	}
	public static void duplicates(int[] a) {
		int lastDup = 0;
		Arrays.sort(a);
		for(int i = 0;i<a.length;i++) {
			if(i<a.length-1 && a[i+1]==a[i] && a[i]!=lastDup) {
				System.out.println(a[i]);
				lastDup = a[i];
			}
		}
	}
	public static void printUNique(int[] a) {
		int lastDup = 0;
		Arrays.sort(a);
		for(int i  =0;i<a.length;i++) {
			if(i<a.length-1 && a[i]==a[i+1] && lastDup!=a[i]) {
				continue;
			}
			else {
				System.out.println(a[i]);
			}
		}
	}
	public static void printDuplicatesUnsortedArr(int[] a) {
		for(int i = 0;i<a.length;i++) {
			int count = 0;
			if(a[i]!=-1) {
				for(int j = i+1;j<a.length;j++) {
					if(a[j] == a[i]) {
						count++;
					}
				}
				if(count>0)
					System.out.println(a[i]);
			}
		}
	}
	public static void printUniqueUnsorted(int[] a) {
		for(int i = 0;i<a.length;i++) {
			int count = 0;
			if(a[i]!=-1) {
				for(int j = i+1;j<a.length;j++) {
					if(a[j]==a[i]) {
						count++;
					}
				}
				if(!(count>0)) {
					System.out.println(a[i]);
				}
			}
		}
	}
	public static void remDupHash(int[] arr) {
		int[] hashArr = new int[100];
		Arrays.fill(hashArr,0);
		for(int i = 0;i<arr.length;i++) {
			int pos= hash(arr[i]);
			if(hashArr[pos]==0) {
			hashArr[pos] = arr[i];
			}else {
				System.out.println(arr[i]);
			}
		}
		
	}
	public static int hash(int a) {
		return a + 1;
	}
	public static void uniqueArrHash(int[] a) {
		int[] hashArr = new int[100];
		Arrays.fill(hashArr, 0);
		for(int i = 0;i<a.length;i++) {
			int pos = hash(a[i]);
			if(hashArr[pos]==0) {
				System.out.println(a[i]);
				hashArr[pos] = a[i];
			}
			else {
				continue;
			}
		}
	}

}
