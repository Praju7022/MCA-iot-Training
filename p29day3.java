public class p29day3 {
    public static void main(String[] args) {
        int a = 10, b = 0;

        try {
            System.out.println("Start");
            int result = a / b;  // exception
            System.out.println("End"); // skipped
        } catch (ArithmeticException e) {
            System.out.println("Handled: Divide by zero");
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues...");
    }
}
