package String_practice;
import java.util.Scanner;
public class Copies {
    String ReturnCopies(String s,int len_copy)
    {
        String w="";
        int l = s.length();

        while(l!=0)
        {
            w+=s.substring(0,len_copy);
            l--;
        }
        return w;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string ");
        String str=sc.nextLine();
        System.out.println("Enter the length of the string to be copy");
        int l=sc.nextInt();
        Copies obj =new Copies();
        System.out.println(obj.ReturnCopies(str,l));

    }
}
