import java.util.Scanner;
public class CharArrayComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        // Getting characters using user-defined method
        char[] userDefinedChars = getCharacters(str);

        // Getting characters using built-in toCharArray() method
        char[] builtInChars = str.toCharArray();

        // Comparing both character arrays
        boolean areEqual = compareArrays(userDefinedChars, builtInChars);

        System.out.println("Characters using user-defined method: " + new String(userDefinedChars));
        System.out.println("Characters using toCharArray(): " + new String(builtInChars));
        System.out.println("Both methods give the same result: " + areEqual);
    }

    // Method to get characters from a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    // Method to compare two character arrays
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
