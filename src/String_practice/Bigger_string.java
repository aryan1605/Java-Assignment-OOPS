package String_practice;
import java.util.Scanner;
public class Bigger_string {
        String JumblingTwoString(String s1,String s2)
        {


            int low;
            String w="";
            if(s1.length()>s2.length())
            {
                low = s2.length();
                for(int i=0;i<low;i++)
                {
                    w+=s1.charAt(i)+s2.charAt(i);
                }
                w+=s1.substring(low,s1.length());
            }
            else if(s1.length()<s2.length())
            {
                low =s1.length();
                for(int i=0;i<low;i++)
                {
                    w+=s1.charAt(i)+s2.charAt(i);
                }
                w+=s1.substring(low,s1.length());
            }
            else
            {
                for(int i=0;i<s1.length();i++)
                {
                    w+=s1.charAt(i)+s2.charAt(i);
                }
            }
            return w;
        }
        public static void main(String args[])
        {
            Scanner sc= new Scanner (System.in);
            System.out.println("Enter the string A ");
            String a= sc.nextLine();
            System.out.println("Enter the string B ");
            String b= sc.nextLine();
            Bigger_string obj=new Bigger_string();
            System.out.println("The jumbled sentence is as follows "+obj.JumblingTwoString(a,b));

        }
}
