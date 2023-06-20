package Day5;

import java.util.ArrayList;

public class Arrays12 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>(3);
		ArrayList<Integer> b = new ArrayList<Integer>(3);
		for(int i = 0;i<3;i++) {
			a.add(i+2);
			b.add(i+1);
			//a->2,3,4 b->1,2,3
		}
		
		System.out.println(midWay(a,b));
	}
	public static int midWay(ArrayList<Integer> a,ArrayList<Integer> b) {
		return a.get(1)+ b.get(1); 
	}
	

}
