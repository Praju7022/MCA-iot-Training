import java.io.*;

public class p28day3 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("java.txt");
            System.out.println("File opened successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: java.txt");
        }
    }
}    