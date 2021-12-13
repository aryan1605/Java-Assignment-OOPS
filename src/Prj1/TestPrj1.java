package Prj1;
import java.util.Scanner;
abstract class Account
{
    double interestRate;
    double amount;
    abstract double calculateInterest();
}
class FDaccount extends Account {
    int noOfDays, ageOfAccountHolder;

    FDaccount(double amount, int noOfDays, int ageOfAccountHolder) {
        this.amount = amount;
        this.noOfDays = noOfDays;
        this.ageOfAccountHolder = ageOfAccountHolder;
    }

    @Override
    double calculateInterest() {
        if (amount < 10000000) {
            if (ageOfAccountHolder >= 65) {
                if (noOfDays >= 7 && noOfDays <= 14) {
                    interestRate = 5.00;
                } else if (noOfDays >= 15 && noOfDays <= 29) {
                    interestRate = 5.25;
                } else if (noOfDays >= 30 && noOfDays <= 45) {
                    interestRate = 6.00;
                } else if (noOfDays >= 45 && noOfDays <= 60) {
                    interestRate = 7.50;
                } else if (noOfDays >= 61 && noOfDays <= 184) {
                    interestRate = 8.00;
                } else if (noOfDays >= 185 && noOfDays <= 365) {
                    interestRate = 8.50;
                } else {
                    System.out.println("Invalid Number of days.Please enter correct values");
                }
            } else {
                if (noOfDays >= 7 && noOfDays <= 14) {
                    interestRate = 4.50;
                } else if (noOfDays >= 15 && noOfDays <= 29) {
                    interestRate = 4.75;
                } else if (noOfDays >= 30 && noOfDays <= 45) {
                    interestRate = 5.50;
                } else if (noOfDays >= 45 && noOfDays <= 60) {
                    interestRate = 7;
                } else if (noOfDays >= 61 && noOfDays <= 184) {
                    interestRate = 7.50;
                } else if (noOfDays >= 185 && noOfDays <= 365) {
                    interestRate = 8.00;
                } else {
                    System.out.println("Invalid Number of days.Please enter correct values");
                }
            }
        } else {
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate = 6.50;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                interestRate = 6.75;
            } else if (noOfDays >= 30 && noOfDays <= 45) {
                interestRate = 6.75;
            } else if (noOfDays >= 45 && noOfDays <= 60) {
                interestRate = 8;
            } else if (noOfDays >= 61 && noOfDays <= 184) {
                interestRate = 8.50;
            } else if (noOfDays >= 185 && noOfDays <= 365) {
                interestRate = 10.00;
            } else {
                System.out.println("Invalid Number of days.Please enter correct values");
            }
        }
        return amount * interestRate / 100;
    }
}
class SBaccount extends Account
{
    String Account_type;
    SBaccount(double amount,String Account_type)
    {
        this.Account_type=Account_type;
        this.amount=amount;
    }
    @Override
    double calculateInterest() {
        if(Account_type.toLowerCase().equals("normal")) {
            interestRate = 4.0;
        }
        else if(Account_type.toLowerCase().equals("nri")){
            interestRate = 6.0;
        }
        return amount*interestRate/100;
    }
}
class RDaccount extends Account {
    double monthlyAccount;
    int noOfMonths;
    int ageOFAccountHolder;

    RDaccount(double monthlyAccount, int noOfMonths, double amount) {
        this.amount = amount;
        this.monthlyAccount = monthlyAccount;
        this.noOfMonths = noOfMonths;
    }

    @Override
    double calculateInterest() {
        if (ageOFAccountHolder > 65) {
            if (noOfMonths >= 6 && noOfMonths < 9) {
                interestRate = 8.00;
            } else if (noOfMonths >= 9 && noOfMonths < 12) {
                interestRate = 8.25;
            } else if (noOfMonths >= 12 && noOfMonths < 15) {
                interestRate = 8.50;
            } else if (noOfMonths >= 15 && noOfMonths < 18) {
                interestRate = 8.75;
            } else if (noOfMonths > 18 && noOfMonths < 21) {
                interestRate = 9.00;
            } else if (noOfMonths == 21) {
                interestRate = 9.25;
            }
        } else {
            if (noOfMonths >= 6 && noOfMonths < 9) {
                interestRate = 7.50;
            } else if (noOfMonths >= 9 && noOfMonths < 12) {
                interestRate = 7.75;
            } else if (noOfMonths >= 12 && noOfMonths < 15) {
                interestRate = 8.00;
            } else if (noOfMonths >= 15 && noOfMonths < 18) {
                interestRate = 8.25;
            } else if (noOfMonths > 18 && noOfMonths < 21) {
                interestRate = 8.50;
            } else if (noOfMonths == 21) {
                interestRate = 8.75;
            }
        }
        return (monthlyAccount * noOfMonths * interestRate / 100) - (amount * interestRate / 100);
    }
}
public class TestPrj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select the option:");
            System.out.println();
            System.out.println("1. Interest Calculator-SB");
            System.out.println("2. Interest Calculator-FD");
            System.out.println("3. Interest Calculator-RD");
            System.out.println("4. Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter the Average amount in your account:");
                double amt = sc.nextDouble();
                System.out.println("Enter the account type");
                String actype = sc.next();
                SBaccount obj = new SBaccount(amt, actype);
                System.out.println("Interest gained is : " + obj.calculateInterest());
            } else if (ch == 2) {
                System.out.println("Enter the FD amount:");
                double amt = sc.nextDouble();
                System.out.println("Enter the number of days:");
                int nd = sc.nextInt();
                System.out.println("Enter your age");
                int age = sc.nextInt();
                FDaccount obj = new FDaccount(amt, nd, age);
                System.out.println("Interest gained is : " + obj.calculateInterest());
            } else if (ch == 3) {
                System.out.println("Enter the RD amount:");
                double amt = sc.nextDouble();
                System.out.println("Enter the monthly amount:");
                double m = sc.nextDouble();
                System.out.println("Enter the number of months:");
                int nm = sc.nextInt();
                RDaccount obj = new RDaccount(m, nm, amt);
                System.out.println("Interest gained is : " + obj.calculateInterest());
            } else if (ch == 4) {
                break;
            } else {
                System.out.println("Invalid choice entered.Please input the correct choice");
            }
        }
    }
}
