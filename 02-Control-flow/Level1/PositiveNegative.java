import java.util.*;

public class PositiveNegative{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if (num > 0){
      System.out.println("positive");
    }
    else if (num < 0) {
      System.out.println("negative");
    } else{
      System.out.println("zero");
    }
  }
}
