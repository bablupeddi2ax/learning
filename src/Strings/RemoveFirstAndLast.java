package Strings;

import java.util.Scanner;

public class RemoveFirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 System.out.println(s.substring(1,s.length()-1));
	}

}
