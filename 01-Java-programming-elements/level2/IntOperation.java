package level2;

import java.util.Scanner;

public class IntOperation {
    // question 7

public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int c=in.nextInt();
    
    int res1= a + b *c;
    int res2= a * b + c;
    int res3= c + a / b;
    int res4= a % b + c;
    System.out.println("The results of int operations are "+res1+","+res2+","+res3+" and "+res4);

    in.close();
}
}
