package Day5;

public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {};
		System.out.println(search(arr,4));
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
