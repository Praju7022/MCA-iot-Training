
// encaplusation//


import java.util.Scanner;

class Student {
    private int marks;

    public void setMarks(int x) {
        if (x > 0 && x < 100) {
            marks = x;
        } else {
            System.out.println("Invalid marks");
        }
    }

    public int getMarks() {
        return marks;
    }
}


public class p17day2 {

    public static void main(String[] args) {
        Student s = new Student();   // ✅ correct object creation

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");

        int marks = sc.nextInt();

        s.setMarks(marks);

        int read_marks = s.getMarks();

        System.out.println("Read marks from Class is = " + read_marks);
    }
}


// encaplusation//