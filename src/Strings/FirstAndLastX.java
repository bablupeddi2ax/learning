package Strings;

import java.util.Scanner;

public class FirstAndLastX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.length()>1) {
			if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x') {
				System.out.print(s.substring(1,s.length()-1));
			}
			else {
				System.out.print(s);
			}
		}
	}

}
