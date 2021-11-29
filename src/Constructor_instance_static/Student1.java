package Constructor_instance_static;
import java.util.Scanner;
public class Student1 {
    public String name ;
    public int percentage ;
    Student1 (String name ,int percentage)
    {
        this.name=name;
        this.percentage=percentage;
    }
    public static void result(Student1 s[])
    {
        int index=0;
        int m = Integer.MIN_VALUE;
        for(int i=0;i<s.length;i++)
        {
            if(s[i].percentage>m) {
                m = s[i].percentage;
                index=i;
            }
        }
        System.out.println("Topper is "+s[index].name);
        System.out.println("percentage of topper is "+s[index].percentage);
    }

}
class Test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Student1 []s = new Student1[3];
        for (int i=0;i<3;i++)
        {
            s[i] = new Student1(sc.next(),sc.nextInt());
        }
        Student1.result(s);
    }
}

