import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        // question 16

        Scanner in=new Scanner(System.in);
        int numberOfStudents=in.nextInt();
        int totalHandshakes=numberOfStudents*(numberOfStudents-1)/2;
        System.out.println("Maximum number of handshakes among "+numberOfStudents+" students is "+totalHandshakes);

        in.close();
    }
}
