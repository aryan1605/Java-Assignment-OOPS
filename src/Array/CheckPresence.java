package Array;
import java.util.Scanner;
public class CheckPresence {

    int arr[], size;
    Scanner sc = new Scanner(System.in);

    CheckPresence() {
        System.out.println("Size of array : ");
        size = sc.nextInt();
        arr = new int[size];
    }

    public void getArray() {
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void inArray() {
        int num, i = 0;
        int flag = 0;
        int pos = 0;
        System.out.println("Enter Search Number : ");
        num = sc.nextInt();
        while (i < arr.length) {
            if (arr[i] == num) {
                flag = 0;
                pos = i;
                break;
            } else {
                flag = 1;
            }
            i++;
        }
        if (flag == 0)
            System.out.println("Position " + pos);
        else
            System.out.println(-1);
    }
}
    class FindNumMain
    {
        public static void main(String[] args)
        {
            CheckPresence obj = new CheckPresence();
            obj.getArray();
            obj.inArray();
        }
    }