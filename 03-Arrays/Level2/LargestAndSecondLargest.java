package Level2;

import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        //question 3

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=in.nextInt();
        int maxDigit=10;
        int[] digits=new int[maxDigit];
        int index=0;

       while (num>0) {
        if(index>10){
            break;
        }
        digits[index]=num%10;
        index++;
        num/=10;
       }

       // finding largest and second largest elemets
       int largest=0;
       int secondLargest=0;
       for(int i=0;i<digits.length;i++){
        if(largest<digits[i]){
            largest=digits[i];
        }
       }for(int i=0;i<digits.length;i++){
        if(largest>digits[i]&&secondLargest<digits[i]){
            secondLargest=digits[i];
        }
       }
       // displaying result
       System.out.println("The largest element in array is "+largest+" and second largest is "+secondLargest);
        
       in.close();
    }
}
