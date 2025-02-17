package level2;

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // question 8

    Scanner in=new Scanner(System.in);

    double a=in.nextDouble();
    double b=in.nextDouble();
    double c=in.nextDouble();
    
    double res1= a + b *c;
    double res2= a * b + c;
    double res3= c + a / b;
    double res4= a % b + c;
    System.out.println("The results of int operations are "+res1+","+res2+","+res3+" and "+res4);

    in.close();
    }
}
