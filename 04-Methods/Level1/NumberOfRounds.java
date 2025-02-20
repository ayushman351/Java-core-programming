package Level1;

import java.util.Scanner;

public class NumberOfRounds {
    public static void main(String[] args) {
        // question 4

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the sides of triangular park in meters");
        double side1=in.nextDouble();
        double side2=in.nextDouble();
        double side3=in.nextDouble();
        int totalDistance=5;

        double rounds=calculateRounds(side1, side2, side3, totalDistance);
        System.out.println("The number of rounds required to cover "+totalDistance+"km distance are "+rounds);

        in.close();
        
    }
    public static double calculateRounds(double s1, double s2 , double s3,int distance){
       double perimeter =s1+s2+s3;
       double rounds=(distance*1000)/perimeter;
       return rounds;
    }
}
