package Array;
import java.util.Scanner;
public class Check1and4 {
    int[] arr;
    int size;
    Scanner sc = new Scanner(System.in);
    Check1and4()
    {
        System.out.println("Size of Array : ");
        size = sc.nextInt();
        arr = new int[size];
    }
    public void getArray()
    {
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    public void search1and4()
    {
        int flag = 0;
        for(int j : arr) {
            if (j == 1 || j == 4)
                flag = 0;
            else {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
class Test
{
    public static void main(String[] args)
    {
        Check1and4 obj = new Check1and4();
        obj.getArray();
        obj.search1and4();
    }
}
