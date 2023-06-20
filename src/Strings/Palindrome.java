package Strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isPalindrome("he"));
	}
	public static boolean isPalindrome(String s) {
		String rev = "";
		for(int i = s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		if(rev.equals(s)) {
		return true;
		}
		return false;
	}
}
