package Strings;

public class Concatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String result = concatenateAndLowercase("Sachin", "Tendulkar");
	        System.out.println(result);
	        
	        result = concatenateAndLowercase("Mark", "kate");
	        System.out.println(result);
	}
	  public static String concatenateAndLowercase(String str1, String str2) {
	        String concatenated = str1 + str2;
	        String lowercase = concatenated.toLowerCase();
	        
	        // Check if the concatenated string contains a double char
	        for (int i = 0; i < lowercase.length() - 1; i++) {
	            if (lowercase.charAt(i) == lowercase.charAt(i + 1)) {
	                // Remove one of the characters
	                lowercase = lowercase.substring(0, i) + lowercase.substring(i + 1);
	                break;
	            }
	        }
	        
	        return lowercase;
	    }
}	
