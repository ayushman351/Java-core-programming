import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in kg : ");
        double weight = sc.nextDouble();
        System.out.print("Enter the height in cm : ");
        double height = sc.nextDouble();

        // Convert height from cm to meters
       double heightM = height / 100;

       // calculting bmi
       double bmi = weight / (heightM * heightM);

       System.out.printf("Your BMI is: %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}
