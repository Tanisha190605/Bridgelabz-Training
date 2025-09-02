package practiceproblem;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float principal=sc.nextFloat();
        float rate=sc.nextFloat();
        float time=sc.nextFloat();
        float simple_interest=(principal * rate * time) / 100;
        System.out.println(simple_interest);
    }
}