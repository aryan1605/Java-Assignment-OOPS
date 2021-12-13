package Practice_Questions;
import java.util.Scanner;
public class GLA_College_Of_Engineering {
    double deposit =10000;
    double original_fees;
    GLA_College_Of_Engineering(double original_fees,double deposit)
    {
        this.deposit+=deposit;
        this.original_fees=original_fees;
        if(this.deposit>=(original_fees/2))
        {
            this.original_fees -= original_fees*0.05;
        }
    }
    void finalTotalFees()
    {
        double totalFess=0;
        totalFess+=original_fees+(0.10*original_fees)+(0.05*original_fees);
        System.out.println("Total Original Fees is "+totalFess);
    }
    public static void main(String args[])
    {
        Scanner console_input =new Scanner(System.in);
        System.out.println("< Enter the original fees value greater than 50000/- >");
        double of = console_input.nextDouble();
        System.out.println("<Enter the deposit >");
        double d = console_input.nextDouble();
        GLA_College_Of_Engineering obj=new GLA_College_Of_Engineering(of,d);
        obj.finalTotalFees();
    }
}
