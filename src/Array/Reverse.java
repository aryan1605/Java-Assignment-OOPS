package Array;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args)
    {
        int[] arr = new int[4];
        int j = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("The given array is : ");
        for (int i = 0; i < 4; i++)
        {
            System.out.println(args[i]);
        }
        for (int i = 0; i < args.length; i++)
        {
            arr[j-1] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
