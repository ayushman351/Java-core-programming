package Level2;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        // question 6 calculating BMI

        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of person ");
        int persons=in.nextInt();

        float[] height=new float[persons];
        float[] weight=new float[persons];

        // taking input for height
        System.out.println("Enter heights in meters of persons ");
        for(int i=0;i<height.length;i++){
            height[i]=in.nextFloat();
        }
        
        // taking input for weight
        System.out.println("Enter weights in kgs of persons ");
        for(int i=0;i<weight.length;i++){
            weight[i]=in.nextFloat();
        }
        
        // creating arrays for storing bmi and status
        float[] bmi=new float[persons];
        String[] status=new String[persons];

        // calculatin bmi and storing status
        for(int i=0;i<persons;i++){
            bmi[i]=weight[i]/(height[i]*height[i]);
            if(bmi[i]<=18.4){
                status[i]="Underweight";
            }else if(bmi[i]>=18.5&&bmi[i]<=24.9){
                status[i]="Normal";
            }else if(bmi[i]>=25.0&&bmi[i]<=39.9){
                status[i]="Overweight";
            }else if(bmi[i]>=40.0){
                status[i]="Obese";
            }
        }
        // displaying results
        for(int i=0;i<persons;i++){
            System.out.println("Detalis of person "+(i+1)+" are, height: "+height[i]+"m, weight: "+weight[i]+"kgs, bmi: "+bmi[i]+", status: "+status[i]);
        }in.close();
         
    }
}
