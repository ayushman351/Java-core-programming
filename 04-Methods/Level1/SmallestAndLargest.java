package Level1;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        // question 
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number one");
        int num1=in.nextInt();
        System.out.println("Enter number two");
        int num2=in.nextInt();
        System.out.println("Enter number three");
        int num3=in.nextInt();

        int[]result=findSmallestAndLargest(num1, num2, num3);
        
        //displaying result
        System.out.println("The largest number is: "+result[0]+"\n smallest number is: "+result[1]);
        
        in.close();

    }
    public static int[] findSmallestAndLargest(int n1, int n2, int n3){

        int largest;
        int smallest;
        if(n1>n2){
            if(n1>n3){
                largest= n1;
                if(n2>n3){
                    smallest=n3;
                }else{
                    smallest=n2;
                }
            }else{
                largest= n3;
                smallest=n2;
            }
        }else if(n2>n3){
            largest= n2;
            if(n1>n3){
                smallest=n3;
            }else{
                smallest=n1;
            }
        }else{
            largest= n3;
            smallest=n1;
        }return new int[] {largest,smallest};
    }
    
}
