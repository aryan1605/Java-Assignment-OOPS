package exceptional_Handling;
import java.util.Scanner;
public class ArrayException1 {
    int[] arr;
    int size, i;
    Scanner sc = new Scanner(System.in);

    ArrayException1() {
        System.out.println("Enter size of array : ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++) {
            try {
                arr[i] = Integer.parseInt(sc.next());
            } catch (NumberFormatException obj) {

                System.out.println("Datatype doesn't match \n Please Enter an Integer Value");
                System.exit(0);
            }
        }
    }
    public void getElement()
    {
        System.out.println("Enter the index of element to be printed : ");
        i = sc.nextInt();
        if (i < arr.length)
        {
            System.out.println("The array element at index " + i + " is " + arr[i] );
        }
        else
        {
            try
            {
                throw new ArrayIndexOutOfBoundsException();
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                e.printStackTrace();
            }
            finally
            {
                System.out.println("The array element successfully accessed.");
            }
        }
    }
}
class AMain
{
    public static void main(String[] args)
    {
        ArrayException1 obj1 = new ArrayException1();
        obj1.getElement();
    }
}
