import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double num = sc.nextDouble();
            if (num <= 0 ) {
                break;
            }
            numbers[index] = num;
            index++;
            if (index == 10) {
                break;
            }
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\nTotal sum: " + total);
    }
    
}