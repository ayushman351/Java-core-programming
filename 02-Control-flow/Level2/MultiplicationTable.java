import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number : ");
      int number = sc.nextInt();
      if(number >=6 && number <=9){
      for (int i = 6; i <= 9; i++) {
          System.out.println(number + " * " + i + " = " + (number * i));
      }
    }
    else{
      System.out.println("Please enter number between 6 to 9");
    }
  }
}
