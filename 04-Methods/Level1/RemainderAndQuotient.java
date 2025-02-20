package Level1;

import java.util.Scanner;

public class RemainderAndQuotient {
    public static void main(String[] args) {
        // question 9
        Scanner in=new Scanner(System.in);
        System.out.println("enter number one");
        int num1=in.nextInt();
        System.out.println("enter number two");
        int num2=in.nextInt();
       
        int[] result=findRemainderAndQuotinet(num1, num2);
        System.out.println("The remainder is: "+result[0]+"\nand the quotient is: "+result[1]);

        in.close();

    }
    public static int[] findRemainderAndQuotinet(int n1, int n2){
        int remainder=n1%n2;
        int quotient=n1/n2;
        return new int[]{remainder,quotient};
    }
}
