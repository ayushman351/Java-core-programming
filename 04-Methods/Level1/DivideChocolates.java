package Level1;

import java.util.Scanner;

public class DivideChocolates {

    public static void main(String[] args) {
        // question 10

        Scanner in=new Scanner(System.in);
        System.out.println("enter number of chocolates");
        int chocolates=in.nextInt();
        System.out.println("enter number of students");
        int students=in.nextInt();
        divideChocolates(chocolates, students);

        in.close();

    }
    public static void divideChocolates(int chocolates,int students){
        int eachStudentGet=chocolates/students;
        int remainingChocolates=chocolates%students;
        System.out.println("Each student will get "+eachStudentGet+" chocolates and remaining chocolates are "+remainingChocolates);

    }
}