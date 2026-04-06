package creditlimit;
import java.util.Scanner;
public class CreditLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("yo enter your account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("enter the balance at beginning of month: ");
        double initialBalance = sc.nextDouble();

        System.out.print("enter the total charges this month: ");
        double charges = sc.nextDouble();

        System.out.print("enter total credits this month: ");
        double credits = sc.nextDouble();

        System.out.print("enter credit limit: ");
        double creditLimit = sc.nextDouble();

        double newBalance = initialBalance + charges - credits;

        System.out.println("\naccount number: " + accountNumber);
        System.out.println("new balance: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("credit limit exceeded");
        }

        sc.close();
    }
}
    
    

