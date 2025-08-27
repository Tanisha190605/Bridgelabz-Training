package DateTime;
import java.time.LocalDate;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter second date (yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());
        if (date1.isBefore(date2)) {
            System.out.println("The first date is BEFORE the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is AFTER the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the SAME.");
        }

        scanner.close();
    }
}
