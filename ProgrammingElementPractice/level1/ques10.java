import java.util.Scanner;
public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double height = sc.nextDouble();
        double inInches = height / 2.54;
        int feet = (int) (inInches / 12);
        int inches = (int) (inInches % 12);
        System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);
    }
}
