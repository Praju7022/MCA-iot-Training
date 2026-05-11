class Payment {
    void pay(double amount) {
        System.out.println("Processing payment...");
    }
}

class UPI extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class Card extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

class Cash extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }
}

public class p21project {
    public static void main(String[] args) {
        Payment p;

        p = new UPI();
        p.pay(500);

        p = new Card();
        p.pay(1000);

        p = new Cash();
        p.pay(200);
    }
}
