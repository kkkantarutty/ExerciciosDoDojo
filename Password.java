package password;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPassword = 6769;
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("yo enter the password(you only get 3 tries tho): ");
            int userPassword = sc.nextInt();
            if (userPassword == correctPassword) {
                System.out.println("access granted bro");
                break;
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println(" BANG incorrect password");
                }
            }
        }

        if (attempts == 3) {
            System.out.println("yeah you are blocked buddy");
        }

        sc.close();
    }
    
}
