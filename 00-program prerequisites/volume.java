import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        //volume of cylinder 
    
        Scanner in=new Scanner(System.in);
        int rad=in.nextInt();
        int h=in.nextInt();
        double volume=3.14*rad*rad*h;
        System.out.println(volume);
        in.close();
    }
}
