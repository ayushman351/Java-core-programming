package Level2;

import java.util.Scanner;

public class StudentsGrade2 {
    public static void main(String[] args) {
        // question 9

        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of students ");
        int students=in.nextInt();

        // creating a 2d array to store each students marks of phy,chem and math
        double[][] studentMarks=new double[students][3];
        // taking input from user for marks
        for(int i=0;i<studentMarks.length;i++){
            System.out.println("Enter the marks of student "+(i+1));
            System.out.println("Enter marks of physics: ");
            studentMarks[i][0]=in.nextDouble();
            System.out.println("Enter marks of chemistry: ");
            studentMarks[i][1]=in.nextDouble();
            System.out.println("Enter marks of math: ");
            studentMarks[i][2]=in.nextDouble();
        }
        // calculating percentage and grades
        double[] percentage=new double[students];
        char[] grades=new char[students];

        for(int i=0;i<studentMarks.length;i++){
            percentage[i]=(studentMarks[i][0]+studentMarks[i][1]+studentMarks[i][3])*100/300;

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
        //displaying result
        for(int i=0;i<studentMarks.length;i++){
            System.out.println("Details of student "+(i+1)+"are, total marks: "+(studentMarks[i][0]+studentMarks[i][1]+studentMarks[i][3])+", percentage: "+percentage[i]+", grades: "+grades[i]);
        }
        in.close();

    }
}
