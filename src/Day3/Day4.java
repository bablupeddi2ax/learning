package Day3;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//System.out.println(find());
			System.out.println(find());
	}
	public static int find() {
		String str1,str2;
		str1 = "hellodidfvf";
		str2 = "hellufdhbvj";
		//find whether first 4 letters of seconds string  in first string
		
		if(str1.contains(str2.substring(0,4))) {
			System.out.println(str2.substring(0,4));
			return 2;
		}
		else {
			return 1;
		}
	}
}

