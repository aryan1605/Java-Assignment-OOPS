package Constructor_instance_static;
import java.util.Scanner;
public class Box {
    double length,breadth,height;
    Box(double length,double breadth,double height)
    {
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    void area()
    {
        System.out.println(2*(length*breadth+breadth*height+height*length));
    }
    void volume()
    {
        System.out.println(length*breadth*height);
    }
}
class box extends Box {
    box(double l, double b, double h) {
        super(l, b, h);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        box ob = new box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        ob.area();
        ob.volume();
    }
}

