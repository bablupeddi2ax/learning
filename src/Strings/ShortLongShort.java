package Strings;

public class ShortLongShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shortLongSHort("a","as"));
	}
	public static String shortLongSHort(String s,String a) {
		if( Integer.max(s.length(),a.length())==s.length()) {
			return a + s+ a;
		}
		return s + a + s;
	} 

}
