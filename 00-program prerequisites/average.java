import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        //calculate avg of three numbers

        Scanner in=new Scanner(System.in);
        float a=in.nextFloat();
        float b=in.nextFloat();
        float c=in.nextFloat();
        double avg=(a+b+c)/3;
        System.out.println(avg);
        

        in.close();
    }
}
