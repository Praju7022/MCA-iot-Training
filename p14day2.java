class Student {
    String name;

    // Constructor
    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println(name);
    }
}

public class p14day2 {
    public static void main(String[] args) {
        Student s1 = new Student("Prajwal");
        s1.display();
    }
}