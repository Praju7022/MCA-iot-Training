import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter units consumed: ");
        double units = sc.nextDouble();

        System.out.print("Enter rate per unit: ");
        double rate = sc.nextDouble();

    
        double bill = units * rate;

        
        bill = bill + 100;

        
        if (bill > 100) {
            double surcharge = bill * 0.10;
            bill = bill + surcharge;
        }

    
        System.out.println("Total Electricity Bill: ₹ " + bill);

        sc.close();
    }
}