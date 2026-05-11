public class p7day5 {
    public static void main(String[] args) {
        int arr[] = {10, 14, 19, 25, 27, 31, 33, 42, 44};
        int target = 27;

        int start = 0;
        int end = arr.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } 
            else if (arr[mid] < target) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}