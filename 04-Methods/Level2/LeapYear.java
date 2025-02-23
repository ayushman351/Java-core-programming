package Level2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // question 3
        Scanner in=new Scanner(System.in);
        System.out.println("Enter year");
        int year=in.nextInt();

        while (year < 1582) {  // Keep asking until a valid year is entered
            System.out.println("LeapYear program only works for year >= 1582.");
            System.out.println("Enter year again:");
            year = in.nextInt();
        }
        if(isLeapYear(year)){
            System.out.println("It's a Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
        in.close();
        
    }
    public static boolean isLeapYear(int year){
        if (year % 4 == 0) {  // Divisible by 4
            if (year % 100 == 0 && year % 400 != 0) {  
                return false; // Century years must be divisible by 400 to be leap years
            }
            return true;  // Otherwise, it's a leap year
        }
        return false; // Not divisible by 4, not a leap year
    }
}
