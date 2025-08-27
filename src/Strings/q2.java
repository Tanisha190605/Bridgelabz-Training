package Strings;
import java.util.Scanner;
public class q2 {
	   public static String createSubstring(String text, int start, int end) {
	       String result = "";
	       for (int i = start; i < end; i++) {
	           result += text.charAt(i);
	       }
	       return result;
	   }
	   public static boolean compareStrings(String a, String b) {
	       if (a.length() != b.length()) {
	           return false;
	       }
	       for (int i = 0; i < a.length(); i++) {
	           if (a.charAt(i) != b.charAt(i)) {
	               return false;
	           }
	       }
	       return true;
	   }

	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       String text = sc.next();
	       System.out.println("Enter start index:");
	       int start = sc.nextInt();
	       System.out.println("Enter end index:");
	       int end = sc.nextInt();
	       String manualSubstring = createSubstring(text, start, end);
	       String builtInSubstring = text.substring(start, end);
	       boolean compare = compareStrings(manualSubstring, builtInSubstring);
	       boolean builtInCompare = manualSubstring.equals(builtInSubstring);
	       System.out.println("Manual substring: " + manualSubstring);
	       System.out.println("Built-in substring: " + builtInSubstring);
	       System.out.println("Manual comparison result: " + compare);
	       System.out.println("Built-in equals() result: " + builtInCompare);
	       if (compare == builtInCompare) {
	    	   System.out.println("Both methods give the correct result");
	        }
	       else {
	    	   System.out.println("Incorrect Result");
	       }
	       sc.close();
	       }
	   }
