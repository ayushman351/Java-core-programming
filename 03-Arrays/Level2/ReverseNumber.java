package Level2;


import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // reversing a number using array
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number ");
        long number=in.nextLong();
        int size=0;
        long rem=0;
        long temp=number;

        while(temp>0){
           rem=temp%10;
           size++;
           temp=temp/10;

        }
        // creating an array of size
        long [] reverse=new long[size];
        int index=0;
         
        // storing digits of the number in array
        while (number>0) {
          reverse[index]=number%10;
          index++;
          number=number/10;
        }
        
        // displaying result
        System.out.println("Your number in reverse: ");
        for(int i=0;i<reverse.length;i++){
          System.out.print(reverse[i]);
        }
        in.close();
        

    }
}
