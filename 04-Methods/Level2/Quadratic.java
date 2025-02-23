package Level2;

import java.util.Arrays;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        // question 11
         Scanner in=new Scanner(System.in);
         System.out.println("Enter value for a");
         double a=in.nextDouble();
         System.out.println("Enter value for b");
         double b=in.nextDouble();
         System.out.println("Enter value for c");
         double c=in.nextDouble();
          
         double[] rootsOfEquation=findRoots(a, b, c);
        
         if(rootsOfEquation.length>1){
            System.out.println("Roots: "+Arrays.toString(rootsOfEquation));
         }else{
            System.out.println("No real roots exits");
         }
          
         in.close();
         
    }
    public static double[] findRoots(double a,double b, double c){
        
        double delta=Math.pow(b, 2)-4*a*c;

        if(delta>0){
            double root1= (-b+Math.sqrt(delta))/(2*a);
            double root2= (-b-Math.sqrt(delta))/(2*a);
            return new double[] {root1,root2};
        
        }else if(delta==0){
            double root=-b/(2*a);
            return new double[]{root};
        }else{
            return new double[]{};
        }
    }
    
}
