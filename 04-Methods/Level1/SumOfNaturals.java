package Level1;

import java.util.Scanner;

public class SumOfNaturals {
    public static void main(String[] args) {
        // question 7
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();

        // calling method
        int sum=calculateSum(n);
        System.out.println("The sum of "+n+" natural number is "+sum);

        in.close();

    }
    public static int calculateSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }return sum;
    }
}
