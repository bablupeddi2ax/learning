package Strings;

import java.util.Scanner;

public class EvenOddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.length()%2==0) {
			System.out.println(s.substring(0,s.length()/2));
		}
		
	}

}
