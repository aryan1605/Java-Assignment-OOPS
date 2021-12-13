package String_practice;
/*
Q2. Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars.
If the inputs are “Mark” and “Kate” then the output should be “markate”.
(The output should be in lowercase)
 */
import java.util.Scanner;
public class Concatenation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        Concatenation ob=new Concatenation();
        ob.concat(s1,s2);
    }

    private void concat(String s1, String s2) {
        String s="";
        if(s1.charAt(s1.length()-1)==s2.charAt(0))
        {
            s=s1.substring(0,s1.length()-1)+s2.substring(0,s2.length());
            System.out.println(s.toLowerCase());
        }
        else
        {
            s=s1+s2;
            System.out.println(s.toLowerCase());
        }
    }
}
