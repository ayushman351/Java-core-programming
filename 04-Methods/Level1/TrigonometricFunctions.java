package Level1;

import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        // question 12

        Scanner in=new Scanner(System.in);
        System.out.println("enter an angle ");
        double angle=in.nextDouble();

        double[] result=calculateTrigonometricFunctions(angle);
        
        // displaying result
        System.out.println("sin "+angle+" = "+result[0]+"\ncos "+angle+" = "+result[1]+"\ntan "+angle+" = "+result[2]);

        in.close();

    }
    public static double[] calculateTrigonometricFunctions(double angle){
        double radian=Math.toRadians(angle);
        double sin=Math.sin(radian);
        double cos=Math.cos(radian);
        double tan=Math.tan(radian);

        return new double[]{sin,cos,tan};
    }
}
