import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student fee (INR): ");
        double fee = sc.nextDouble();
        System.out.print("Enter discount percent: ");
        double percent =sc.nextDouble();
        double discount = (fee * percent) / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
