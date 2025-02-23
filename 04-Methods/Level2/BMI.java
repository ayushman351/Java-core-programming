package Level2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // question 10
        Scanner in=new Scanner(System.in);
        int numberOfPerson=3;
        double[][] personData=new double[numberOfPerson][3];
        String[] status=new String[numberOfPerson];

        //taking user input for weight and height for each person
        for(int i=0;i<numberOfPerson;i++){
            System.out.println("Enter the data for person "+(i+1));
            System.out.println("Enter weight in kg : ");
            personData[i][0]=in.nextDouble();
            System.out.println("Enter height in cm : ");
            personData[i][1]=in.nextDouble()/100;

            personData[i][2]=calculateBmi(personData[i][0], personData[i][1]);
            
            status[i]=weightStatus(personData[i][2]);
        }
        
        //displaying weight status of each person
        for(int i=0;i<numberOfPerson;i++){
            System.out.println("Details of person "+(i+1)+": "+"weight: "+personData[i][0]+" kg, height: "+(personData[i][1]*100)+" cm, BMI: "+personData[i][2]+", status: "+status[i]);
        }
        in.close();

    }//method to calulate bmi
    public static double calculateBmi(double weight, double height){
        double bmi=weight/(height*height);
        return bmi;
            
    }
    // method to find weight status
    public static String weightStatus(double bmi){

            if(bmi<=18.4){
                return "Underweight";
            }else if(bmi>=18.5&&bmi<=24.9){
                return "Normal";
            }else if(bmi>=25.0&&bmi<=39.9){
                return "Overweight";
            }else{
                return "Obese";
             }
    }

}
