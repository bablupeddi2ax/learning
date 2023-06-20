package Sunday;
import java.util.*;

public class UniqueDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nonRepeated(291));
	}
	public static int uniqueDigitsCount(int a) {
		int count = 0;
		ArrayList<Integer> ar= new ArrayList<Integer>();
		if(a%10==a) {
			return 1;
		}
		while(a!=0) {
		ar.add(a%10);
		a/=10;
		}
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		int lastDup = 0;
		for(int i  =0;i<ar.size();i++) {
			if(i<ar.size()-1 && ar.get(i)==ar.get(i+1) && lastDup!=ar.get(i)) {
				continue;
			}
			else {
		
				count++;
			}
		}
		
		return count;
	}
	public static int nonRepeated(int a) {
		int count = 0;
		ArrayList<Integer> ar= new ArrayList<Integer>();
		if(a%10==a) {
			return 1;
		}
		while(a!=0) {
		ar.add(a%10);
		a/=10;
		}
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		if(ar.get(0)!=ar.get(1)) {
			count++;
		}
		if(ar.get(ar.size()-1) != ar.get(ar.size()-2)){
			count++;
		}
		for(int i  =1;i<ar.size()-1;	i++) {
			if(ar.get(i-1) !=ar.get(i) && ar.get(i) !=ar.get(i+1)  ) {
				count++;
			}
		}
		return count;
	}
}
