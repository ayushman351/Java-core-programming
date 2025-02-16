import java.util.Scanner;

public class Kmtomi {
    public static void main(String[] args) {
        // converting km to miles
        Scanner in=new Scanner(System.in);
        float k=in.nextFloat();
        double m=k *0.621371;
        System.out.println(m);


        in.close();
    }
}
