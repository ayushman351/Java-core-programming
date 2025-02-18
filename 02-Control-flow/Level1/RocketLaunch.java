import java.util.*;

public class RocketLaunch{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the countdown start value: ");
    int counter = sc.nextInt();
    
    while (counter >= 0) {
        System.out.print(counter + "... ");
        counter--;
    }
  }
}
