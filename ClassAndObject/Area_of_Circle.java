package Java_class_objects;

class Circle {
    double radius;

    double area() {
        return 3.14 * radius * radius;
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }

    void display() {
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }

}
public class Area_of_Circle {
    public static void main(String[] args) {
        Circle c = new Circle();
		c.radius = 5;
		c.display();
	}
}
