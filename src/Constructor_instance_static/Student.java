package Constructor_instance_static;
import java.util.Scanner;
public class Student {
    public String name ;
    public int age;
    public String address;
    Student()
    {
        name ="Unknown";
        age = 0;
        address = "not available";
    }
    public void setInfo(String name ,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setInfo(String name ,int age,String address)
    {
        this.name =name;
        this.age=age;
        this.address=address;
    }
    public String toString()
    {
        return "NAME: "+name+"\nAGE: "+age+"\nADDRESS: "+address;
    }
}
class TestStudent1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Student obj[]=new Student[10];
        for (int i=0;i<10;i++)
        {
            System.out.println("<Adding values to object>");
            obj[i]=new Student();
            obj[i].setInfo(sc.next(),sc.nextInt(), sc.next());
        }
        for(Student s:obj)
        {
            System.out.println(s);
        }
    }
}
