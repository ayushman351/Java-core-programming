package Level2;

import java.util.Scanner;

public class Bmi2 {
    public static void main(String[] args) {
        // question 7

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of persons ");
        int persons=in.nextInt();
        double[][] personData=new double[persons][3];

        // taking input from user to store person data
        for(int i=0;i<personData.length;i++){
            System.out.println("Enter data of person "+(i+1));
            System.out.println("Enter weight in kgs and height in meters");
            for(int j=0;j<personData[i].length-1;j++){
                personData[i][j]=in.nextDouble();
            }
        }
        // calculating bmi and storing weight status
        String[] weighStatus=new String[persons];

        for(int i=0;i<personData.length;i++){
            for(int j=0;j<2;j++){
                personData[i][2]=personData[i][0]/(personData[i][1]*personData[i][1]);
                if(personData[i][2]<=18.4){
                    weighStatus[i]="Underweight";
                }else if(personData[i][2]>=18.5&&personData[i][2]<=24.9){
                    weighStatus[i]="Normal";
                }else if(personData[i][2]>=25.0&&personData[i][2]<=39.9){
                    weighStatus[i]="Overweight";
                }else if(personData[i][2]>=40.0){
                    weighStatus[i]="Obese";
                }
            }
        }
        // displaying results
        for(int i=0;i<personData.length;i++){
            System.out.println("Data of person "+(i+1));
                System.out.println("weight: "+personData[i][0]+"kgs, height: "+personData[i][1]+"m, BMI: "+personData[i][2]+", weight status: "+weighStatus[i]);
            
        }in.close();
 


    }
}
