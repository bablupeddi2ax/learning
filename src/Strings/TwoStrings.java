package Strings;

public class TwoStrings {

    public static void main(String[] args) {
        fun("hello", "world");
    }

    public static void fun(String a, String b) {
        StringBuilder sb = new StringBuilder();
        if(a.length()>b.length()) {
        for(int i = 0;i<a.length();i++) {
        	if(i<b.length()-1 ) {
        		if(i%2==0) {
        			sb.append(a.charAt(i));
        		}
        		else {
        			sb.append(b.charAt(i));
        		}
        	}
        	sb.append(a.charAt(i));
        }
        }
        else if(a.length()<b.length() || a.length()==b.length()){
        	for(int i = 0;i<b.length();i++) {
            	if(i<a.length()-1 ) {
            		if(i%2==0) {
            			sb.append(a.charAt(i));
            		}
            		else {
            			sb.append(b.charAt(i));
            		}
            	}
            	sb.append(b.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

}
