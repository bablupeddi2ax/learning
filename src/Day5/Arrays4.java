package Day5;
//
public class Arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[65];
		for(int i = 0;i<26;i++) {
			a[i] = i+65;
		}
		for(int i = 0;i<a.length;i++) {
			char ch =(char)a[i];
			System.out.print(ch);
		}
	}

}
