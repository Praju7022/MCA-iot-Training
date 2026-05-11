public class p25day3 {
    public static void main(String[] args) {

        String s = "  Java Programming  ";
        String s2 = "java";

        // 1. length()
        System.out.println("Length: " + s.length());

        // 2. trim()
        String trimmed = s.trim();
        System.out.println("Trimmed: " + trimmed);

        // 3. charAt()
        System.out.println("Character at index 2: " + trimmed.charAt(2));

        // 4. substring()
        System.out.println("Substring (0,4): " + trimmed.substring(0, 4));

        // 5. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // 6. equals() and equalsIgnoreCase()
        System.out.println("Equals: " + trimmed.equals(s2));
        System.out.println("Equals Ignore Case: " + trimmed.equalsIgnoreCase(s2));

        // 7. contains()
        System.out.println("Contains 'Java': " + trimmed.contains("Java"));

        // 8. replace()
        System.out.println("Replace 'a' with 'o': " + trimmed.replace('a', 'o'));

        // 9. indexOf() and lastIndexOf()
        System.out.println("First index of 'a': " + trimmed.indexOf('a'));
        System.out.println("Last index of 'a': " + trimmed.lastIndexOf('a'));

        // 10. startsWith() and endsWith()
        System.out.println("Starts with 'Java': " + trimmed.startsWith("Java"));
        System.out.println("Ends with 'ing': " + trimmed.endsWith("ing"));

        // 11. split()
        String str = "Java,Python,C++";
        String[] arr = str.split(",");
        System.out.println("Split result:");
        for (String x : arr) {
            System.out.println(x);
        }

        // 12. concat()
        String a = "Hello";
        String b = "World";
        System.out.println("Concat: " + a.concat(" " + b));

        // 13. isEmpty()
        String emptyStr = "";
        System.out.println("Is Empty: " + emptyStr.isEmpty());

        // 14. valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("Converted number to String: " + numStr);
    }
}
