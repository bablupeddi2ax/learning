package Day3;

import java.util.Scanner;
import java.util.*;
public class Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String str1[]=str.split(" ");
		//hello world->world

//		String firstHalf ="";
//		String secondHalf ="";
//		String fh  = "";
//		for(int i = 0;i<str1[1].length();i++) {
//			if(i<3) {
//				firstHalf = firstHalf + str1[1].charAt(i);
//			firstHalf.toUpperCase();
//			
//			
//			}
//			if(i>=3 && i<str1[1].length()) {
//				secondHalf+=str1[1].charAt(i);
//			}
//			
//		}
//		System.out.println(firstHalf.toUpperCase()+  secondHalf);
//		
		//String n = str1[1].substring(0, 3).toUpperCase() + str1[1].substring(3,str1[1].length());
//		String v = "";
//		for(int i = 0;i<=2;i++) {
//			System.out.println(str1[1].charAt(i));
//		}
////		
//		System.out.println(v.toUpperCase());
//		//System.out.println(n);
		
		//palindrome ap1
	/*	String s = str1[0];
		String rev = "";
		for(int i =s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.print("palindrome");
		}
		else {
			System.out.print("not a palindrome");
		} */
		//pallindrome ap2
		String s = str1[1];
		StringBuilder sb =new StringBuilder(s);
		sb.reverse();
		String rev = sb.toString(); 
		if(rev.equals(s))
		{
			System.out.print("palindrome");
			
		}
		
		else {
			System.out.print("not a palindrome");
		}
		
		
	}

}
