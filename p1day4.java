public class p1day4 {
    public static void main(String[] args) {
        String[] name = new String[5];
        name[0] = "Alice";
        name[1] = "Bob";
        name[2] = "Charlie";
        name[3] = "David";
        name[4] = "Eve";
        /*for (String i : name)*/ {
            for (int i = 0; i < name.length; i++) {
            System.out.println(i);
        }
    }
}
