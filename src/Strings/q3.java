package Strings;
import java.util.Scanner;

public class q3{
    public static char[] getChars(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();
        char[] manualChars = getChars(text);
        char[] builtInChars = text.toCharArray();
        boolean result = compareCharArrays(manualChars, builtInChars);
        System.out.println("Manual char array: ");
        for (char c : manualChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Built-in char array: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        if (result) {
            System.out.println("Both methods give the same result");
        } else {
            System.out.println("Results are different");
        }

        sc.close();
    }
}

