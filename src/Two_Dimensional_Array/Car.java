package Two_Dimensional_Array;
import java.util.Scanner ;
public class Car {
    public String Manufacturer;
    public float price;

    Car(String Manufacturer, float price) {
        this.Manufacturer = Manufacturer;
        this.price = price;
    }

    static void display_sorted_details(Car obj[]) {
        String temp_manufacturer;
        float temp_price;
        Car arr[] = new Car[obj.length];
        for (int i = 0; i <= obj.length - 1; i++) {
            for (int j = 0; j <= obj.length - i - 1; j++) {
                if (obj[i].price < obj[j + 1].price) {

                }
            }
        }
        System.out.println("< Sorted instance of car on the basis of price are as follow > ");
        for (int j = 0; j < obj.length; j++) {
            System.out.printf("%f %s\n", obj[j].price, obj[j].Manufacturer);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("< How many object you want to create >");
        int l = sc.nextInt();
        Car obj[] =new Car[l];
        for (int i = 0;i<obj.length;i++)
        {
            System.out.println("< Adding properties to the object >");
            obj[i] = new Car( sc.next(),sc.nextFloat());
        }
        display_sorted_details(obj);
    }
}
