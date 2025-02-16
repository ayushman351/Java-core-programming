import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        // area of circle of radius(input)
        Scanner in=new Scanner(System.in);
        int rad=in.nextInt();
        double area=3.14*rad*rad;
        System.out.println(area);
        in.close();

    }
}
