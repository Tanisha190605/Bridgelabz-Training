package practiceproblem;
import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextInt();
        double height=sc.nextInt();
        double volume=Math.PI *radius*radius*height;
        System.out.println(volume);
    }
}