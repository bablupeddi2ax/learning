package Day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print true if every element is 1 or 4
		ArrayList<Integer> a  = new ArrayList(Arrays.asList(1,2,4,1,4));
		
		System.out.println(oneOrFour(a));
	}
	public static boolean oneOrFour(ArrayList<Integer> a) {
		boolean res= true;
		for(int i : a) {
			if(i==4 ||i==1) {
				continue;
			}
			else {
				res = false;
			}
		}
		return res;
		
	}
}
