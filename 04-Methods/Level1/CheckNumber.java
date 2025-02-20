package Level1;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        // question 5

        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int num=in.nextInt();
        
        //calling method
        int result=checkNumber(num);
        if (result==1){
            System.out.println("Number you entered is positive");
        }else if(result==0){
            System.out.println("Number you entered is zero ");
        }else if(result==-1){
            System.out.println("Number you entered is negative");
        }
        
        in.close();
    }
    public static int checkNumber(int num){
     if(num>0){
        return 1;
     }else if(num==0){
        return 0;
     }else{
        return -1;
     }
    }
}
