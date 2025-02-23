package Level2;

import java.util.Arrays;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //question 1
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=in.nextInt();
         
        int [] factors=findFactors(number);
        // displaying result
        System.out.println("Factors of "+number+": "+Arrays.toString(factors));
        System.out.println("Sum of factors: "+sumOfFactors(factors));
        System.out.println("Product of factors: "+productOfFactors(factors));
        System.out.println("Sum of squares of factors: "+sumOfSquares(factors));

        in.close();


    }

    // a method to find factors
    public static int[] findFactors(int number){

        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        // initialising an array of size count
        int[] factors=new int[count];
        int index=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                factors[index]=i;
                index++;
            }
        }return factors;
    }

    // method for calculating sum of factors
    public static int sumOfFactors(int factors[]){
        int sum=0;
        for(int i=0;i<factors.length;i++){
           sum+=factors[i];
        }
        return sum;
    }

    // method for product of factors
    public static long productOfFactors(int factors[]){
        long product=1;
        for(int i=0;i<factors.length;i++){
            product*=factors[i];
        }
        return product;
    }

    // method for sum of squares of factors
    public static int sumOfSquares(int factors[]){
        int sum=0;
        for(int i=0;i<factors.length;i++){
            sum+=Math.pow(factors[i], 2);
        }
        return sum;
    }
}
