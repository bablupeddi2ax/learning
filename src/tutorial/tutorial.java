package tutorial;

public class tutorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("one to 10");
	oneToTen();
	System.out.println();
	System.out.println("even numbers between 23 and 57");
	even();
	System.out.println("primes between 10 and 99");
	primeList(10,100);
	System.out.println("sum of all degits in a number");
	//sumofALLDigits(3);
	sumOfALLDigits(900);
	
	swap(10,20);
	System.out.print(noOfChars("hello"));
	}
	// function to print numbers from one to 10
	public static void oneToTen() {			
		for(int i=1;i<11;i++) {			
			System.out.print(i+"\t");
	    }
	}
	
	public static void even() {
	for(int i=23;i<58;i++) {
		if(i%2==0)
			System.out.println(i);
	}
	}
	
	public static boolean isprime(int n) {
		for(int i=23;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void primeList(int a,int b) {
		for(int i =a;i<b;i++) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void sumOfALLDigits(int n) {
		int sum=0;
		while(n>0) {
			int temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		System.out.println("sum of digits in"+n+" "+sum);
	}

	public static void swap(int a, int b) {
		System.out.println("before swapping a is" + a+"b is " + b);
		int temp = b;
		b = a;
		a = temp;
		System.out.println("after  swapping a is" + a+"b is " + b);
	}
	public static int noOfChars(String a) {
		int count = 0;
		count = a.length();
		return count;
	}
}


