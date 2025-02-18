import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;

         // Finding the greatest factor excluding itself
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; //Break as soon as we find the largest factor
            }
        }

        System.out.println("Greatest factor excluding itself : " +greatestFactor);
    }
}
