import java.util.Scanner;

public class SumUntilZeroOrNegative {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;

        while (true) {
            int num = sc.nextInt();
            if (num <= 0) {
                break;
            }
            sum += num;
        }

        System.out.println(sum);
    }
    
}
