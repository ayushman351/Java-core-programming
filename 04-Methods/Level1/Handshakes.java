package Level1;

import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        // question 2
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of students ");
        int students=in.nextInt();

        // calling method
        maximumHandshakes(students);

        in.close();


    }public static void maximumHandshakes(int students){
        int handshakes=(students*(students-1))/2;
        System.out.println("The maximum number of handshakes possible among "+students+" students are "+handshakes);
    }
}
