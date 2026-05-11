
    //  linear search //  time complexity O(n) and space complexity O(1)

public class p6day5 {
    public static void main(String[] args) {
        int arr[] = {3, 8, 12, 6, 10, 20};
        int target = 6;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println("Element found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}