package Strings;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i  = 0;i<s.length();i++) {
			if(s.charAt(i)=='*') {
				System.out.println(s.substring(0,i-1) + s.substring(i + 2,s.length()));
				break;
			}
		}
	}

}
