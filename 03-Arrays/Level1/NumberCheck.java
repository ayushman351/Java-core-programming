import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];  // Declare an integer array to store 5 numbers

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is a positive even number.");
                } else {
                    System.out.println(num + " is a positive odd number.");
                }
            } else if (num < 0) {
                System.out.println(num + " is a negative number.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

        if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than the last element.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First element is less than the last element.");
        } else {
            System.out.println("First and last elements are equal.");
        }
    }
}