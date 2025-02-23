package Level2;

import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        // question 7
        Scanner in=new Scanner(System.in);
        int[] studentsAge=new int[10];
        
        for(int i=0;i<studentsAge.length;i++){
            System.out.print("Enter age of student "+(i+1)+" : ");
            studentsAge[i]=in.nextInt();
            if(canStudentVote(studentsAge[i])){
                System.out.println("result: Student can vote");
            }else {
                System.out.println("result: Student can not vote");
            }
        }
        in.close();

    }
    public static boolean canStudentVote(int age){
        if(age<=0){
            return false;
        }else if(age>=18){
            return true;
        }else{
            return false;
        }
    }
}
