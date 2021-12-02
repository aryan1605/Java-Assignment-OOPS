package Two_Dimensional_Array;
import java.util.Scanner;
public class Room {
    public boolean AC_ON;
    public boolean HOME_THEATRE_ON;
    public boolean FAN_ON;
    public boolean LIGHT_ON;
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        Room obj = new Room();
        int power=0;
        while(true)
        {
            System.out.println("< Press >");
            System.out.println("1: AC\n2: HOMETHEATRE\n3: FAN\n4: LIGHT\n5: EXIT ");
            int ch = sc.nextInt();
            if(ch==1) {
                System.out.println("Do you want to turn on the AC?");
                obj.AC_ON = sc.nextBoolean();
                if(obj.AC_ON==true)
                    power+=1200;
            }
            else if(ch==2){
                System.out.println("Do you want to turn on the Hometheatre ?");
                obj.HOME_THEATRE_ON = sc.nextBoolean();
                if(obj.HOME_THEATRE_ON==true)
                    power+=600;
            }
            else if(ch==3){
                System.out.println("Do you want to turn on the FAN ?");
                obj.FAN_ON=sc.nextBoolean();
                if(obj.FAN_ON==true)
                    power+=400;
            }
            else if(ch==4){
                System.out.println("Do you want to turn on the LIGHT ?");
                obj.LIGHT_ON= sc.nextBoolean();
                if(obj.LIGHT_ON==true)
                    power+=100;
            }
            else if(ch==5){
                if(power>2000)
                    System.out.println("Power Overload !");
                else
                    System.out.println("Power consumed is "+power);
                break;
            }
        }
    }
}
