package Level2;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        // question 8

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of students ");
        int students=in.nextInt();
       

        // creating arrays for storing marks, percentage and grades
        int[] physics=new int[students];
        int[] chemistry=new int[students];
        int[] maths=new int[students];
        float[] percentage=new float[students];
        char[] grades=new char[students];

        // taking input for marks of phy, chem and maths for each student
        for(int i=0;i<students;i++){
            System.out.println("Enter marks for student "+(i+1));
            System.out.println("Enter marks in physics: ");
            int marks=in.nextInt();
            if(marks<0){
                System.out.println("Invalid marks, enter again ");
                i--;
            }physics[i]=marks;

            System.out.println("Enter marks in chemistry: ");
             marks=in.nextInt();
             if(marks<0){
                System.out.println("Invalid marks, enter again ");
                i--;
            }chemistry[i]=marks;

            System.out.println("Enter marks in maths: ");
             marks=in.nextInt();
             if(marks<0){
                System.out.println("Invalid marks, enter again ");
                i--;
            }maths[i]=marks;
        }

        //calculating percentage and grades 
        for(int i=0;i<students;i++){
            percentage[i]=(physics[i]+chemistry[i]+maths[i])*100f/300;

            if(percentage[i]<=39){
                grades[i]='R';
            }else if(percentage[i]>=40&&percentage[i]<=49){
                grades[i]='E';
            }else if(percentage[i]>=50&&percentage[i]<=59){
                grades[i]='D';
            }else if(percentage[i]>=60&&percentage[i]<=69){
                grades[i]='C';
            }else if(percentage[i]>=70&&percentage[i]<=79){
                grades[i]='B';
            }else if(percentage[i]>=80){
                grades[i]='A';
            }
        }
        // displaying results
         for(int i=0;i<students;i++){
            System.out.println("Details of Student "+(i+1)+" total marks: "+(physics[i]+chemistry[i]+maths[i])+", percentage: "+percentage[i]+"%, grades: "+grades[i]);
         }
         in.close();

        

    }
}
