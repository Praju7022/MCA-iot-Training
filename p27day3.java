public class p27day3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        double s = 0;

        try {
            s = a / b;   // exception occurs here
            System.out.println(5); // won't execute
        } catch (ArithmeticException e) {
            System.out.println("Exception handled: Divide by zero");
        }

        System.out.println("Program continues...");
    }
}