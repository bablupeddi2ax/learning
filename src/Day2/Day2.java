package Day2;
import java.util.Arrays;
import java.util.Scanner;
public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(sumOfOddDigitsInANumber(123456789));
		frequencyOfDigits(7892738);
//		int n = sc.nextInt();
//		for(int i = 2;i<n/2;i++) {
//			if(n%i==0) {
//				System.out.println("not prime");
//			}
//			else {
//				System.out.println(" prime");
//				break;
//			}
//		}
//		sc.close();
//		
//		
//		System.out.print("enter number");
//		Scanner c = new Scanner(System.in);
//		int num = sc.nextInt();
//		int sum = 0;
//		while(num>0) {
//			int rem = num%10;
//			int temp = rem*rem;
//			sum = sum+temp;
//			num/=10;
//		}
//		System.out.println("sum"+sum);
//		sc.close();
		
		
			// TODO Auto-generated method stub
		//System.out.print(isPalindrome(242));
			
		}
		//function for printing a number given as argument
		public static boolean isPalindrome(int n) {
		    int rev = 0;
		    int or = n;
		    while (n > 0) {
		        int temp = n % 10;
		        rev = rev * 10 + temp;
		        n = n / 10;
		    }
		    if (rev == or) {
		        return true;
		    } else {
		        return false;
		    }}
  
		public static int sumOfOddDigitsInANumber(int num) {
			int count=0,sum = 0;
			while(num>0) {
				int dig = num%10;
				if(count%2==0) {
					sum+=dig;
					System.out.println(dig);
				
				}
				count++;
				num = num/10;
			}
			return sum;
		}
		public static void frequencyOfDigits(int num) {
		    String s = String.valueOf(num);
		    int n = s.length();
		    
		    // Sort the characters in the string
		    char[] arr = s.toCharArray();
		    Arrays.sort(arr);
		    s = new String(arr);
		    
		    // Traverse the sorted string and count the frequency of each character
		    int i = 0;
		    while (i < n) {
		        char curr = s.charAt(i);
		        int count = 1;
		        while (i + 1 < n && s.charAt(i + 1) == curr) {
		            count++;
		            i++;
		        }
		        System.out.println(curr + "'s count is " + count);
		        i++;
		    }
		}

			
		}


//
//1. Write a program to check whether the given number is palindrome. 
//2.write a program to calculate the sum of the odd digits in a given number. 
//3. Write a program to count the occurences of each digit in a given number.