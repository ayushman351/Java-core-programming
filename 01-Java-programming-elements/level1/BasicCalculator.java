import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        // question 11

        Scanner in=new Scanner(System.in);
        float num1=in.nextFloat();
        float num2=in.nextFloat();
        
        // addition
        float add=num1+num2;
        
        // subtraction
        float sub=num1-num2;

        // multiplication
        float mul=num1*num2;

        //division
        float div=num1/num2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+add+","+sub+","+mul+",and "+div);
        
        in.close();
        
    }
}
