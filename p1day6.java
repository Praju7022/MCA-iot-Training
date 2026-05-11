public class p1day6 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 4, 4, 4, 4, 4, 4, 4, 6, 8, 9, 12};
        int target = 4;

        int fo = firstOccurrence(arr, target);
        int lo = lastOccurrence(arr, target);

        System.out.println("First occurrence: " + fo + "\nLast occurrence: " + lo);
        System.out.println("Frequency: " + (lo - fo + 1)); // corrected
    }

    public static int firstOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, result = -1;

        while (left <= right) {
            int mid_index = (left + right) / 2;

            if (arr[mid_index] == key) {
                result = mid_index;
                right = mid_index - 1; // move left
            } else if (key < arr[mid_index]) {
                right = mid_index - 1;
            } else {
                left = mid_index + 1;
            }
        }
        return result;
    }

    public static int lastOccurrence(int[] arr, int key) {
        int left = 0, right = arr.length - 1, result = -1;

        while (left <= right) {
            int mid_index = (left + right) / 2;

            if (arr[mid_index] == key) {
                result = mid_index;
                left = mid_index + 1; // move right
            } else if (key < arr[mid_index]) {
                right = mid_index - 1;
            } else {
                left = mid_index + 1;
            }
        }
        return result;
    }
}