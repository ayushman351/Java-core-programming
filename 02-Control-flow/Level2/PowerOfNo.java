import java.util.Scanner;

public class PowerOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        
        System.out.print("Enter the exponent power : ");
        int power = sc.nextInt();
    
        int result = 1;
    
        // Calculating power
        for (int i = 1; i <= power; i++) {
          result *= number;
        }
    
        System.out.println(number + "^" + power + " = " + result);
    }
}
