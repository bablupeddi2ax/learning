package Day5;
import java.util.ArrayList;
import java.util.Arrays;
public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1,0,1,0,0,1,1
		ArrayList<Integer> arr=  new ArrayList<>(Arrays.asList(2,2,2));
		ArrayList<Integer> n = evenOdd(arr);
		for(int i :n) {
			System.out.println(i);
		}
	}
	//Integer wrapper class instead of integer while passing array as argument
	public static ArrayList<Integer> evenOdd(ArrayList<Integer> arr) {
		//put even before odd in any order
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();

	for(int i:arr) {
		if(i%2==0) {
			even.add(i);
		
		}
		else {
			odd.add(i);
			
		}
	}
	int elenght = 0;
	int k =0;
	arr.clear();
	for(int i =0;i<even.size() + odd.size();i++) {
		if(elenght!=even.size()) {
		arr.add(even.get(i));
		elenght++;
		}
		else {
			if(k<odd.size()) {
			arr.add(odd.get(k));
			k++;
			}
		}
	}
		return arr;
	}
}
