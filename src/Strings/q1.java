package Strings;
import java.util.Scanner;
public class q1 {
	public static boolean compareStrings(String a,String b) {
		if(a.length() != b.length()) {
			return false;
		}
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=b.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		boolean compare=compareStrings(a,b);
		boolean builtInCompare=a.equals(b);
		System.out.println(compare);
		System.out.println(builtInCompare);
		if(compare==builtInCompare) {
			System.out.println("Both methods give the correct result");
		}
		else {
			System.out.println("Incorrect Result");
		}
		sc.close();
	}

}
