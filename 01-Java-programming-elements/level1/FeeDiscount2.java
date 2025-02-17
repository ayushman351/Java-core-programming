import java.util.Scanner;

public class FeeDiscount2 {
    public static void main(String[] args) {
        // question 9

        int fee;
        int discountPercent;

        Scanner in=new Scanner(System.in);
        fee=in.nextInt();
        discountPercent=in.nextInt();
        double discount=(discountPercent*fee)/100;
        double discountedAmount=fee-discount;

        System.out.println("The discount amount is INR "+discount+" and the final discounted fee is INR "+discountedAmount);

        in.close();
    }
}
