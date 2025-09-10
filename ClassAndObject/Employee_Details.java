package Java_class_objects;

class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

}
public class Employee_Details {
	public static void main(String[] args) {
        Employee emp = new Employee();
	    emp.name = "Tanisha";
	    emp.id = 100;
	    emp.salary = 50000;
	    emp.displayDetails();
    }
}