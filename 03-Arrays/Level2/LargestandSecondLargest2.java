package Level2;

import java.util.Scanner;

public class LargestandSecondLargest2 {
    public static void main(String[] args) {
        // question 4

        Scanner in=new Scanner(System.in);
        // taking input for number from user
        System.out.println("Enter a number");
        long num=in.nextLong();

        int maxDigit=10;
        long[] digits=new long[maxDigit];
        int index=0;

        // storing digits of number in array
        while (num>0) {
            if(index>maxDigit-1){
                // array is small so creating new array
                long[] temp=new long[maxDigit*2];
                
                //copying elements from old array to new array
                for(int i=0;i<digits.length;i++){
                    temp[i]=digits[i];
                }
                // assigning temp to digits ref variable
                digits=temp;
                
            }
            digits[index]=num%10;
            index++;
            num/=10;
           }
    
           // finding largest and second largest elemets
           long largest=0;
           long secondLargest=0;
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
