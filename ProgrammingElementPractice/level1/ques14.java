import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double cm = sc.nextDouble();
        double inches = cm / 2.54;
        int feet = (int)(inches / 12);
        int remainingInches = (int)(inches % 12);
        System.out.println("Your height in cm is " + cm + " while in feet is " + feet + " and inches is " + remainingInches);
    }
}
