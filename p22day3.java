// Method Overloading

public class p22day3 {
    public static void main(String[] args) {
        summation S = new summation();

        S.math_method(10, 20);           // calls int, int
        S.math_method(2, 3, 4);          // calls int, int, int
        S.math_method("Rahul", "Dravid"); // calls String, String
    }
}

class summation {

    void math_method(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    void math_method(int a, int b, int c) {
        int mul = a * b * c;
        System.out.println(mul);
    }

    void math_method(String s1, String s2) {
        String s = s1 + s2;
        System.out.println(s);
    }
}