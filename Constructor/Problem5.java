package Java_Constructors;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available = true;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully!");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println("Book: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }
}

public class Problem5 {

	public static void main(String[] args) {
		LibraryBook book1 = new LibraryBook("Java Programming", "James Gosling", 450.50);
        LibraryBook book2 = new LibraryBook("Effective Java", "Joshua Bloch", 600.00);
        book1.display();
        book2.display();
        book1.borrowBook();
        book1.borrowBook();
        book1.display();

	}

}
