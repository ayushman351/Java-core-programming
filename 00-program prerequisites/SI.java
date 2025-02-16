import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        // calculate simple interest 
        Scanner in=new Scanner(System.in);
        int p,r,t;
        p=in.nextInt();
        r=in.nextInt();
        t=in.nextInt();

        double SI=(p*r*t)/100;
        System.out.println(SI);

        in.close();


    }
}
