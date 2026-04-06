package atm;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how much would you like to withdraw: ");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("that´s invalid bro. you can´t withdraw nothing.");
        } else {
            int[] bills = {100, 50, 20, 10, 5, 2, 1};

            System.out.println("dispensing:");

            for (int bill : bills) {
                int count = amount / bill;
                if (count > 0) {
                    System.out.println("R$ " + bill + ": " + count + " bill(s)");
                    amount %= bill;
                }
            }
        }

        sc.close();
    }
    
}
