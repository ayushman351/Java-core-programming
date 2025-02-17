import java.util.Scanner;

public class ConvertDistance2 {
    public static void main(String[] args) {
        // question 8

        Scanner in=new Scanner(System.in);
         long km=in.nextLong();
         double mil=km/1.6;
         System.out.println("The total miles is "+mil+" mile for the given "+km+" km");


         in.close();
    }
}
