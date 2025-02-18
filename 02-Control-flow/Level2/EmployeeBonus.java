import java.util.*;

class EmployeeBonus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter salary: ");
    int salary = sc.nextInt();
    
    System.out.print("Enter years of service: ");
    int year = sc.nextInt();
    
    double bonus = 0;

    if (year > 5) {
      bonus = salary * 0.05;
      System.out.println("Bonus amount: " + bonus);
    } else {
      System.out.println("No bonus awarded.");
    }
  }
}
