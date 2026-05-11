import java.util.Scanner;

// Interface for Payment
interface Payment {
    void pay(double amount);
}

// UPI Payment Implementation
class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter UPI ID: ");
        String upiId = scanner.nextLine();
        System.out.println("Processing UPI payment of $" + amount + " from UPI ID: " + upiId);
        System.out.println("Payment successful via UPI!");
    }
}

// Credit Card Payment Implementation
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Credit Card Number: ");
        String cardNumber = scanner.nextLine();
        System.out.print("Enter Expiry Date (MM/YY): ");
        String expiry = scanner.nextLine();
        System.out.print("Enter CVV: ");
        String cvv = scanner.nextLine();
        System.out.println("Processing Credit Card payment of $" + amount + " with Card: " + cardNumber);
        System.out.println("Payment successful via Credit Card!");
    }
}

// Cash Payment Implementation
class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Please pay $" + amount + " in cash.");
        System.out.println("Cash payment accepted!");
    }
}

// Main Class
public class p24day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Payment System");
        System.out.print("Enter the amount to pay: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.println("Choose payment method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Cash");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Payment payment = null;
        switch (choice) {
            case 1:
                payment = new UPIPayment();
                break;
            case 2:
                payment = new CreditCardPayment();
                break;
            case 3:
                payment = new CashPayment();
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        payment.pay(amount);
        System.out.println("Thank you for your payment!");
    }
}
