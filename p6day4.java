public class p6day4 {
    public static void main(String[] args) {

        int num[] = new int[5];   // correct way

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        // print array
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}