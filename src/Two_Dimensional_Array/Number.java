package Two_Dimensional_Array;
import java.util.Scanner;
public class Number {
    int num;
    boolean status;
    Scanner sc = new Scanner(System.in);
    Number()
    {
        num = sc.nextInt();
    }
    public boolean isZero()
    {
        if (num==0)
            status = true;
        return status;
    }
    public boolean isPositive()
    {
        if(num>0)
            status = true;
        return status;
    }
    public boolean isNegative()
    {
        if (num<0)
            status = true;
        return status;
    }
    public boolean isOdd()
    {
        if (num % 2 == 1)
            status = true;
        return status;
    }
    public boolean isEven()
    {
        if (num % 2 == 0)
        status = true;
        return status;
    }
    public boolean isPrime()
    {
        if(num==0)
        {
            status = false;
        }
        else
        {
            for (int i = 0; i < num/2; i++)
            {
                if (num%2==0)
                {
                    status = false;
                    break;
                }
                else
                    status = true;
            }
        }
        return status;
    }
    //public boolean isArmstrong()
    {

    }

}



