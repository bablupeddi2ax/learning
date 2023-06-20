package Strings;

import java.util.Scanner;

public class Ncopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int copies= s.length();
		String ss= s.substring(0,2);
		
		System.out.println(ss.repeat(copies));
	}

}
