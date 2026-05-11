import java.util.ArrayList;

public class p7day4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // 🔹 ADD elements
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        System.out.print("After Adding: ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        // 🔹 INSERT element at index
        list.add(2, 111);

        System.out.print("\nAfter Inserting at index 2: ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        // 🔹 ACCESS elements
        System.out.println("\n\nAccessing Elements:");
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 2: " + list.get(2));

        // 🔹 UPDATE element
        list.set(1, 999); // replace index 1 value

        System.out.print("\nAfter Updating index 1: ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        // 🔹 REMOVE element
        list.remove(3); // remove element at index 3

        System.out.print("\nAfter Removing index 3: ");
        for (int i : list) {
            System.out.print(i + " ");
        }

        // 🔹 REMOVE by value
        list.remove(Integer.valueOf(111));

        System.out.print("\nAfter Removing value 111: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}