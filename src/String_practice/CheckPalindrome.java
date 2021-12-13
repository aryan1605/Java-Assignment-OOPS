package String_practice;
import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String S= sc.next();
        CheckPalindrome obj=new CheckPalindrome();
        obj.Palindrome(S);
    }

    private void Palindrome(String str) {
        StringBuffer sb=new StringBuffer(str);
        if(str.equals(sb.reverse().toString()))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not a Palindrome String");
        }
    }
}
