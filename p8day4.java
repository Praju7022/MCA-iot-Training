import java.util.ArrayList;
import java.util.Scanner;

// Student class
class Student {
    int id;
    String name;
    int marks;

    // constructor
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // display method
    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

// Main class
public class p8day4 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // ADD STUDENT
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    list.add(new Student(id, name, marks));
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    // VIEW ALL
                    if (list.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        System.out.println("\nStudent List:");
                        for (Student s : list) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    // SEARCH BY ID
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Student s : list) {
                        if (s.id == searchId) {
                            System.out.println("Student Found:");
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    // UPDATE STUDENT
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    boolean updated = false;

                    for (Student s : list) {
                        if (s.id == updateId) {

                            System.out.print("Enter new Name: ");
                            s.name = sc.next();

                            System.out.print("Enter new Marks: ");
                            s.marks = sc.nextInt();

                            System.out.println("Student Updated Successfully!");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}