package Array;

public class ascii {
    int[] ascii1;
    ascii()
    {
        ascii1 = new int[] {77,83,68};
    }
    void print_Array()
    {
        int i;
        for(i = 0; i < ascii1.length; i++)
        {
            System.out.println((char) ascii1[i]);
        }
    }
}
class AsciiValMain
{
    public static void main(String[] args) {
        ascii obj = new ascii();
        obj.print_Array();
    }
}