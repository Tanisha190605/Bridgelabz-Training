package Java_Methods;
import java.util.Scanner;
import static java.lang.System.out;
public class SI {
	public static double calculateSimpleInterest(double Principal, double Rate, double Time) {
		return (Principal * Rate * Time) / 100;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		out.print("Enter Principal: ");
		double Principal = sc.nextDouble();
		out.print("Enter Rate of Interest: ");
		double Rate = sc.nextDouble();
		out.print("Enter Time (in years): ");
		double Time = sc.nextDouble();
        double si = calculateSimpleInterest(Principal, Rate, Time);
        out.println("The Simple Interest is " + si +
        		" for Principal " + Principal +
		        ", Rate of Interest " + Rate +
		        " and Time " + Time);
        sc.close();
	}
}
