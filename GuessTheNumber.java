package guessthenumber;
import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String tryAgain;

        do {
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int guess;
            boolean won = false;
            System.out.println("yo! i challenge you to guess the number between 1 and 100!");
            while (attempts < 10) {
                System.out.print("this is attempt " + (attempts + 1) + ": ");
                guess = sc.nextInt();
                attempts++;

                if (guess > secretNumber) {
                    System.out.println("way too high bro");
                } else if (guess < secretNumber) {
                    System.out.println("way too low bro");
                } else {
                    System.out.println("damn you got it, good job unc!");
                    System.out.println("you got it on attempt #" + attempts);
                    won = true;
                    break;
                }
            }

            if (!won) {
                System.out.println("LMAO you lost!");
                System.out.println("the secret number was: " + secretNumber +"LOL");
            } else {
                System.out.println("you won!");
            }

            System.out.print("yo unc do you want to play again? (yes/no): ");
            tryAgain = sc.next();

        } while (tryAgain.equalsIgnoreCase("yes"));

        sc.close();
    }
    
}
