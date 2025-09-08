public class ques7 {
	public static void main(String[] args) {
		double radius = 6378;
	    double pi = Math.PI;
	    double volume = (4.0 / 3.0) * pi * Math.pow(radius, 3);
	    double radius2 = radius / 1.6;
	    double volume2 = (4.0 / 3.0) * pi * Math.pow(radius2, 3);
	    System.out.println("The volume of earth in cubic kilometers is " + volume);
	    System.out.println("The volume of earth in cubic miles is " + volume2);
	}
}
