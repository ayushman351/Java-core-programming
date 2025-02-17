import java.util.Scanner;

public class CalculateDistance {
    public static void main(String[] args) {
        // question 14

        Scanner in=new Scanner(System.in);
        float feet=in.nextFloat();
        float yards=feet/3;
        float miles=yards/1760;

        System.out.println("The distance in yards is "+yards+" and in miles is "+miles);

        in.close();
    }
}
