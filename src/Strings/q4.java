package Strings;

public class q4 {
    public static void generateException() {
        String text = null;
        System.out.println("Length of text: " + text.length());
    }
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling generateException()...");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Program crashed with Exception: " + e);
        }
        System.out.println("\nCalling handleException()...");
        handleException();
    }
}
