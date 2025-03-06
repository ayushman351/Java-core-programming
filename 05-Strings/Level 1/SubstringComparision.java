import java.util.*;
public class SubstringComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.print("Enter the start index: ");
        int start = sc.nextInt();

        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        // Creating substring using charAt()
        String charAtSubstring = createSubstring(str, start, end);

        // Creating substring using built-in substring() method
        String builtInSubstring = str.substring(start, end);

        // Comparing both substrings
        boolean areEqual = compareStrings(charAtSubstring, builtInSubstring);

        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Both substrings are equal: " + areEqual);

    }

    // Method to create substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
