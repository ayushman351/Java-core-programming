import java.util.*;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;


        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if we need to expand the array
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the array size
                    int[] temp = new int[maxFactor];

                    // Copy elements from old array to new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // Assign new array to factors
                }
                factors[index++] = i; // Store the factor
            }
        }

        // Printing the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

      
    }
}