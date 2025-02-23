package Level2;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        // question 9
        Scanner in=new Scanner(System.in);
        int[] numbers=new int[5];
        
        // taking input from user
        for(int i=0;i<5;i++){
            System.out.print("Enter number "+(i+1)+": ");
            numbers[i]=in.nextInt();

            //checking if number is postive or not
            if(isPositive(numbers[i])){
                System.out.println("Number is positive");

                // checking if number is even or not
                if(isEven(numbers[i])){
                    System.out.println("Number is even ");
                }else{
                    System.out.println("Number is odd ");
                }
            }else{
                System.out.println("Number is negative");
            }
                 System.out.println();
        } // comparing first and last element of array
        if(compare(numbers[0], numbers[4])==1){
            System.out.println("First element is greater than second");
        }else if(compare(numbers[0], numbers[4])==0){
            System.out.println("First and last elements are equal");
        }else if(compare(numbers[0], numbers[4])==-1){
            System.out.println("First element is less than second ");
        }

        in.close();
    }

    public static boolean isPositive(int num){
        if(num>0){
            return true;
        }else if(num<0){
            return false;
        }else{
            return false;
        }
    }

    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }

    }
    
    public static int compare(int n1, int n2){
        if(n1>n2){
            return 1;
        }else if(n1==n2){
            return 0;
        }else{
            return -1;
        }
    }
}
