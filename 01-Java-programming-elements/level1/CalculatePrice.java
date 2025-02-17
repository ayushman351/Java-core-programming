import java.util.Scanner;

public class CalculatePrice {
    public static void main(String[] args) {
        // question 15

        Scanner in=new Scanner(System.in);
        int unitPrice=in.nextInt();
        int quantity=in.nextInt();

        System.out.println(unitPrice*quantity);
        

        in.close();
    }
}
