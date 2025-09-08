import java.util.Scanner;
public class ques2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        double area1 = 0.5 * base * height;
        double area2 = area1 / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + area2 + " and sq cm is " + area1);
        sc.close();
    }
}
