package level2;

import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        // question 3

        Scanner in=new Scanner(System.in);
        float perimeter=in.nextFloat();
        float side=perimeter/4;
         System.out.println(
            "The length of the side is "+side+" whose perimeter is "+perimeter
         );

         in.close();  
    }
}
