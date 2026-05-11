import java.util.*;

public class p2day5 {
    public static void main(String[] args) {
        
        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(85);
        marks.add(90);
        marks.add(70);
        marks.add(80);

        System.out.println("Sorted marks: " + marks);

        System.out.println("Lowest marks: " + marks.first());
        System.out.println("Highest marks: " + marks.last());

        System.out.println("Above or equal to 80: " + marks.tailSet(80));
        System.out.println("Below 80: " + marks.headSet(80));
    }
}