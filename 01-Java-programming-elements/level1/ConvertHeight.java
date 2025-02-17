import java.util.Scanner;

public class ConvertHeight {
    public static void main(String[] args) {
        // question 10
          

        Scanner in=new Scanner(System.in);
        float cms=in.nextFloat();
        float inches=cms/2.54f;
        float feet=inches/12;

        System.out.println("Your Height in cm is "+cms+" while in feet is "+feet+" and inches is "+inches);

      in.close();
    }
}
