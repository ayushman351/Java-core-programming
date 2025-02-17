public class FeeDiscount {
    public static void main(String[] args) {
        // question 6

        int fee=125000;
        int discountPercent=10;
        int discount=(discountPercent*fee)/100;
        int discountedAmount=fee-discount;

        System.out.println("The discount amount is INR "+discount+" and the final discounted fee is INR "+discountedAmount);
    }
}
