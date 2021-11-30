package Array;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int n,rev = 0,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        num = n;
        while(num != 0)
        {
            rev = (rev * 10) + (num % 10);
            num = num / 10;
        }
        if(rev == n)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not a Palindrome Number");
        }
    }
}
