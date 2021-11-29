package Constructor_instance_static;
import java.util.Scanner;
public class Book {
    String name;
    String author;
    double price;
    int qtyInStock;

    public String getName()
    {
        return name;
    }

    public String getAuthor()
    {
        return author;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQtyInStock()
    {
        return qtyInStock;
    }

    Book(String B_Name, String A_Name, double Cost, int Qty)
    {
        name = B_Name;
        author = A_Name;
        price = Cost;
        qtyInStock = Qty;
    }
}
class BookMain
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Introduction To Basic Electrical Engineering", "S.K.Sahdev", 500, 10);
        Book b2 = new Book("An Introduction to OOPs", "C.Thomas Wu", 700, 50);
        Book b3 = new Book("Operating System Concepts", "Peter Galvin", 1500, 70);
        Book b4 = new Book("Data Communication & Network", "Behrouz.A.Foruzan", 1100, 60);
        System.out.println("Book Name : " + b2.getName());
        System.out.println("Author Name : " + b2.getAuthor());
        System.out.println("Cost : Rs. " + b2.getPrice());
        System.out.println("Quantity : " + b2.getQtyInStock());
    }
}