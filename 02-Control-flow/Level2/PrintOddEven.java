import java.util.*;

class PrintOddEven{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int number = sc.nextInt();

    // Checking if the number is natural
    if (number <= 0) {
      System.out.println("Please enter a natural number greater than 0 ");
    } else {
      for (int i = 1; i <= number; i++) {
        if (i % 2 == 0) {
          System.out.println(i + " is Even");
        } else {
          System.out.println(i + " is Odd");
        }
      }
    }
  }
}
