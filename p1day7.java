import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class p1day7 {

    public static void main() {

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));

        list.addFirst(5); // Add element at the start
        list.addLast(60); // Add element at the end

        System.out.println("Linked List after adding elements:");

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Reverse the singly linked list
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (Integer num : list) {
            reversedList.addFirst(num);
        }

        System.out.println("Reversed Linked List:");
        for (Integer num : reversedList) {
            System.out.println(num);
        }

    }
}