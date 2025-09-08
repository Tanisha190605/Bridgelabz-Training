import java.util.Scanner;
public class ques1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int birth_year = 2000;
		int current_year = sc.nextInt();
		int current_age=current_year-birth_year;
		System.out.println("Harry's age in "+ current_year+" is "+ current_age);
		sc.close();
	}
}
