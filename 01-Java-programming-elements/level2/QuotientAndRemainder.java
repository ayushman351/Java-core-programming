package level2;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        // question 6

        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();

        int quotient=num1/num2;
        int remainder=num1%num2;
        System.out.println("The quotient is "+quotient+" and remainder is "+remainder+" of two numbers "+num1+" and "+num2);
        in.close();

    }
}
