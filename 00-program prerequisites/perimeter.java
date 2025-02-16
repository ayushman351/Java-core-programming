import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        // perimeter of rectangle
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        int w=in.nextInt();

        int perimeter=2*(l+w);

        System.out.println(perimeter);
        in.close();

    }
}
