package Strings;

import java.util.Scanner;

public class StringAndInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String  s= sc.nextLine();
		int n =sc.nextInt();
		System.out.println(s.substring(s.length()-n,s.length()).repeat(n));
	}

}
