import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // Taking input for ages
    System.out.print("Enter age of Amar: ");
    int ageAmar = sc.nextInt();
    System.out.print("Enter age of Akbar: ");
    int ageAkbar = sc.nextInt();
    System.out.print("Enter age of Anthony: ");
    int ageAnthony = sc.nextInt();

    // Taking input for heights
    System.out.print("Enter height of Amar (in cm): ");
    int heightAmar = sc.nextInt();
    System.out.print("Enter height of Akbar (in cm): ");
    int heightAkbar = sc.nextInt();
    System.out.print("Enter height of Anthony (in cm): ");
    int heightAnthony = sc.nextInt();

    // Finding the youngest
    int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
    String youngest = (minAge == ageAmar) ? "Amar" : (minAge == ageAkbar) ? "Akbar" : "Anthony";

    // Finding the tallest
    int maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
    String tallest = (maxHeight == heightAmar) ? "Amar" : (maxHeight == heightAkbar) ? "Akbar" : "Anthony";

    System.out.println("Youngest friend: " + youngest);
    System.out.println("Tallest friend: " + tallest);


    }
}
