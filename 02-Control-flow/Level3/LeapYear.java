import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {  // if not divisible by 100 then it is leap year
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year."); // if any of them is false then it will not a leap year
            }

            
        }
    }
    
}
