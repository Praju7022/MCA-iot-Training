import java.util.LinkedList;

public class p9day9 {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();

        LL.add(10);
        LL.add(20);
        LL.add(30);

        // Traverse
        for (Integer s : LL) {
            System.out.println(s);
        }

        System.out.println("First Data: " + LL.getFirst());
        System.out.println("Last Data: " + LL.getLast());
        System.out.println("Get Data: " + LL.get(1));
    }
}