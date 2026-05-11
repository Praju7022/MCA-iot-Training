import java.util.Scanner;

public class p5 {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice (1-Add, 2-Buy, 3-Delete):");

        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Add to cart");
                break;

            case 2:
                System.out.println("Product Purchase");
                break;

            case 3:
                System.out.println("Delete Product");
                break;

            default:
                System.out.println("Invalid Input");
        }

        sc.close();
    }
}