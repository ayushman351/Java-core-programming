package Level2;

import java.util.Scanner;

public class SumOfNaturals {
    public static void main(String[] args) {
        //question 2
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a natural number");
        int num=in.nextInt();
        
        if(num>0){
           int sum1=sumOfNaturalNumbers(num);
           int sum2=sumOfNaturalNumbersRecursive(num);

            // displaying result
        System.out.println("Sum1 = Sum2 : "+(sum1==sum2));
        System.out.println("Sum1 = "+sum1+"\nSum2 = "+sum2);


        }else{
            System.out.println("Not a natural number");
        }
         
        in.close();
       

    }
    public static int sumOfNaturalNumbers(int num){
        int sum=num*(num+1)/2;
        return sum;
    }
    public static int sumOfNaturalNumbersRecursive(int num){
        
        if(num==1){
            return 1;
        }
        return num+sumOfNaturalNumbersRecursive(num-1);
    }
}
