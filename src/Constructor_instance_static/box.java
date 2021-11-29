package Constructor_instance_static;

import java.util.Scanner;
 class Box {
     public int length, breadth,area;
     public Box(int length, int breadth)
     {
         this.length = length;
         this.breadth = breadth;
     }
     public void area()
     {
         area = length * breadth;
     }
     public void printArea()
     {
         System.out.println("Area : " + area);
     }
 }
class Box3D extends Box
{
    public int height,volume;
    public Box3D(int length, int breadth, int height)
    {
        super(length, breadth);
        this.height = height;
    }
    public void volume()
    {
        volume = (length * breadth) * height;
    }
    public void printVolume()
    {
        System.out.println("Volume : " + volume);
    }
}
class Test2
{
    public static void main(String[] args)
    {
        Box obj = new Box(7, 8);
        obj.area();
        obj.printArea();

        Box3D obj1 = new Box3D(4,5,7);
        obj1.volume();
        obj1.printVolume();
    }
}

