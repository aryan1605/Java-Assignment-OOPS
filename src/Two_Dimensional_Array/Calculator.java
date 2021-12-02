package Two_Dimensional_Array;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(powerInt(n1,n2));
        System.out.println(powerDouble(n1,n2));
    }
    public static double powerInt(int num1,int num2){
        return  Math.pow(num1,num2);
    }
    public static double powerDouble(double num1,int num2){
        return Math.pow(num1,num2);
    }
}
