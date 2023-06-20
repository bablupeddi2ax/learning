package Day3;

import java.util.Scanner;

public class Day3Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to remove vowels from given string
		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		String withoutVowels = "";
//		for(int i = 0;i<s.length();i++) {
//			switch(s.charAt(i)) {
//			case 'a':
//			case 'A':
//				break;
//			case 'e':
//			case 'E':
//				break;
//			case 'I':
//			case 'i':
//				break;
//			case 'O':
//			case 'o':
//				break;
//			case 'u':
//			case 'U':
//				break;
//			default:
//				withoutVowels+=s.charAt(i);
//			}
//		}
//		System.out.println(withoutVowels);
		
		//reverse each word in a given string 
	
		/*String p = sc.nextLine();
		String[] arr = p.split(" ");
		for(int i= 0;i<arr.length;i++) {
			String toBeReversed = arr[i];
			arr[i] = revString(toBeReversed);
		}
		p="";
		for(int i =0;i<arr.length;i++) {
			p+=arr[i];
		System.out.println(arr[i] + " ");
		}
		System.out.println(p);
	}
	public static  String revString(String str) {
		String rev = "";
		for(int i =str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}		
		return rev;
	} */
		
		//display the smallest and the largest word in a given string 	
		String s = sc.nextLine();
		String[] str=  s.split(" ");
		for(int i = 0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		String smallest = str[0],largest = str[0];
		for(int i = 0;i<str.length;i++) {
			if(str[i].length()<smallest.length()){
				smallest = str[i];
			
			} if(str[i].length()>largest.length()) {
				largest = str[i];
			}
			
			
		}
		System.out.println("smallest" + smallest   + "\n" + "largest "  + largest);
	}

}
