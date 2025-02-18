import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of 10 students : ");
        int[] ages = new int[10]; // Declare an integer array to store ages of 10 students

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of "+(i+1)+" student : ");
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
    }
    
}