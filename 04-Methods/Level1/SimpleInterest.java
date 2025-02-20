package Level1;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        // question 1
        Scanner in=new Scanner(System.in);
        System.out.println("Input principle amount ");
        float principle=in.nextFloat();
        System.out.println("Input rate ");
        float rate=in.nextFloat();
        System.out.println("Input Time ");
        float time=in.nextFloat();

        // calling function and passing values of principle, rate and time
        calculateSimpleInterest(principle, rate, time);
         in.close();

    }
    static void calculateSimpleInterest(float principle, float rate, float time){
        double simpleInterest=principle*rate*time/100;
        System.out.println("The simple interest is "+simpleInterest+" for priciple "+principle+", rate of interest "+rate+" and time "+time);
    }
}