package practice;
import java.util.Scanner;

public class Forloop {
	public static int fib(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int k = sc.nextInt();
	System.out.println(fib(k));
	
	
	
		

	
	
	
	
		
		
		
		
		
	}

}
