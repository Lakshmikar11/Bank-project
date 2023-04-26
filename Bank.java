import java.util.*;
public class Bank {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double Balance=0;
            System.out.println("Enter your 4 digit PIN");
        int PIN= sc.nextInt();
        int pswmatch=1234;
        if(PIN==pswmatch) {
            System.out.println();
        }else{
            System.out.println("You Entered Wrong PIN");
            System.exit(0);
        }
            System.out.println("Option: 1 SAVINGS");
            System.out.println("Enter your option");
        int SAVINGS= sc.nextInt();
        if(SAVINGS==1) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("Enter your option");
        }else{
            System.out.println("Enter Valid Option");
            System.exit(0);
        }

            int Options= sc.nextInt();
            if(Options==1) {
                System.out.println("Enter Deposit Amount:");
                double Amount = sc.nextDouble();
                if (Amount <= 0) {
                    System.out.println("Enter Valid amount");
                } else {
                    Balance = Balance + Amount;
                    System.out.println("Balance in your Account is: " + Balance);
                }
            } else if (Options==2) {
                System.out.println("Enter Withdraw Amount:");
                double Amount = sc.nextDouble();
                if (Amount <= 0) {
                    System.out.println("Enter Valid amount");
                } else {
                    Balance = Balance - Amount;
                    System.out.println("Balance in your Account is: "+Balance);
                }
            }else {
                System.exit(0);
            }
    }
}
