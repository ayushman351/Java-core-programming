package Level2;

import java.util.Scanner;

public class DigitsFrequency {
    public static void main(String[] args) {
        // question 10

        Scanner in=new Scanner(System.in);
        System.out.println("Enter number ");
        int number=in.nextInt();

        // finding size of array;
        int size=0;
        int temp=number;
        while (temp>0) {
            int rem=temp%10;
            size++;
            temp/=10;
        }

        // creating array of size
        int digits[]=new int[size];
        int index=0;
        
        // storing the digits of number in digitsArray
        while (number>0) {
            digits[index]=number%10;
            index++;
            number/=10;
        }

        // calculating frequency of each digit
        int frequency[]=new int[10];
        for(int i=0;i<digits.length;i++){
            frequency[digits[i]]++;
        }
        // displaying result
        for(int i=0;i<10;i++){
            if(frequency[i]>0){
                System.out.println("The frequency of "+i+" is "+frequency[i]);
            }
        }in.close();

    }
}
