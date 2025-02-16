import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        // calculate power 
        Scanner in=new Scanner(System.in);
        int base=in.nextInt();
        int exponent=in.nextInt();
        double power=Math.pow(base,exponent);
        System.out.println(power);
        in.close();

    }
}
