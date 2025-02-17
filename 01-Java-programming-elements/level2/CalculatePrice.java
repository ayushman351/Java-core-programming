package level2;

import java.util.Scanner;

class CalculatePrice {
public static void main(String[] args) {
    // question 5

    Scanner in=new Scanner(System.in);
        int unitPrice=in.nextInt();
        int quantity=in.nextInt();

        System.out.println("The total purchase price is INR "+unitPrice*quantity+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
        

        in.close();
}
    
}