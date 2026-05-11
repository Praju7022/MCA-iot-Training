import java.util.Scanner;

public class p10day4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        // Q1
        System.out.println("1. What is the size of int in Java?");
        System.out.println("a) 2 b) 4 c) 8 d) 16");
        char ans1 = sc.next().charAt(0);
        if (ans1 == 'b') {
            score += 10;
        }

        // Q2
        System.out.println("\n2. Which keyword is used to inherit a class?");
        System.out.println("a) this b) super c) extends d) implements");
        char ans2 = sc.next().charAt(0);
        if (ans2 == 'c') {
            score += 10;
        }

        // Q3
        System.out.println("\n3. Which data structure uses FIFO?");
        System.out.println("a) Stack b) Queue c) LinkedList d) ArrayList");
        char ans3 = sc.next().charAt(0);
        if (ans3 == 'b') {
            score += 10;
        }

        // Q4
        System.out.println("\n4. Which is not a Java access modifier?");
        System.out.println("a) public b) private c) protected d) package");
        char ans4 = sc.next().charAt(0);
        if (ans4 == 'd') {
            score += 10;
        }

        // Q5
        System.out.println("\n5. Which operator is used for comparison?");
        System.out.println("a) = b) == c) != d) <>");
        char ans5 = sc.next().charAt(0);
        if (ans5 == 'b') {
            score += 10;
        }

        // Final Result
        System.out.println("\nTotal Score: " + score);

        if (score >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        // Grade
        if (score == 50) {
            System.out.println("Grade: A+");
        } else if (score >= 40) {
            System.out.println("Grade: A");
        } else if (score >= 30) {
            System.out.println("Grade: B");
        } else if (score >= 20) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}