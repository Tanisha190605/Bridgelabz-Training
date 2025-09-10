package Java_Constructors.Instance;

public class Product_Inventory {
    String name;
    double cost;
    static int count = 0;

    Product_Inventory(String name, double cost) {
        this.name = name;
        this.cost = cost;
        count++;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Cost: ₹" + cost);
    }

    static void showCount() {
        System.out.println("Total Products: " + count);
    }

    public static void main(String[] args) {
        Product_Inventory p1 = new Product_Inventory("Laptop", 55000);
        Product_Inventory p2 = new Product_Inventory("Phone", 25000);
        Product_Inventory p3 = new Product_Inventory("Watch", 3000);

        p1.showDetails();
        p2.showDetails();
        p3.showDetails();

        Product_Inventory.showCount();
    }
}
