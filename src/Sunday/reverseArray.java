package Sunday;

public class reverseArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,4,5};
		revArray1(arr);
		for(int i =0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
	public static void revArray1(int[] arr) {
		int j = arr.length-1;
		int i = 0;
		while(i<j){
			int tmp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = tmp;
			i++;
			j--;
		}
	}
}
