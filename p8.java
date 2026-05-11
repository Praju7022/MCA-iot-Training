import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {

        int pin = 1234;
        int enteredPin;
        int attempts = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the PIN");
            enteredPin = sc.nextInt();
            attempts++;

            if (enteredPin == pin) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Wrong PIN. Try again");
            }

        } while (attempts < 3);

        if (enteredPin != pin) {
            System.out.println("Account locked");
        }

        sc.close();
    }
}