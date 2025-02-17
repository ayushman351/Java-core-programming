import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        // question 13

        Scanner in=new Scanner(System.in);
        float perimeter=in.nextFloat();
        float side=perimeter/4;
         System.out.println(
            "The length of the side "+side+" whose perimeter is "+perimeter
         );

         in.close();
    }
}
