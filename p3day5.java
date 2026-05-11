*    // HashMap in Java //

/import java.util.*;

public class p3day5 {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(1, "JavaScript"); // overwrite

        System.out.println(map);
 -   }
} 
    

