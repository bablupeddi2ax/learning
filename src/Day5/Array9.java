package Day5;
public class Array9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove all tens 
		int arr[] = {1,99,10};
		int a[] = removeTens(arr);
		for(int i = 0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}
	public static int[] removeTens(int[] arr) {
		//1,10,10,2
		int arr1[]  = new int[arr.length];
		int top = -1;
		for(int i = 0;i<arr1.length;i++) 
		{
			if(arr[i]==10) {
				continue;
			}
			else if(arr[i]!=10) {
				if(top<0) {
					top = top+1;
					arr1[top] = arr[i];
				}
				else {
					top++;
					arr1[top] = arr[i];
				}
			}
			
		}
		return arr1;
	}

}
