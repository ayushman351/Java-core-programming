package Level2;

import java.util.Scanner;

public class YoungestFriend {
    public static void main(String[] args) {
        // question 2
        Scanner in=new Scanner(System.in);
        double []height=new double[3];
        double[]age=new double[3];
        String[] friends={"Amar", "Akbar","Anthony"};

        // taking user input for height and age
        for(int i=0;i<3;i++){
            System.out.println("Enter height in cms for "+friends[i]);
            height[i]=in.nextDouble();
            System.out.println("input recieved");
            
            System.out.println("Enter age for "+friends[i]);
            age[i]=in.nextDouble();
            System.out.println("input recieved");

        }

        // finding the youngest and tallest 
      

        int youngestFriend=0;
        int tallestFriend=0;
        double youngest=age[0];
        double tallest=height[0];
        for(int i=0;i<3;i++){
            if(youngest>age[i]){
                youngest=age[i];
                youngestFriend=i;
                

            }if(tallest<height[i]){
                tallest=height[i];
                tallestFriend=i;
            }
        }
        
        // displaying result
        
        System.out.println("The youngest among 3 friends is "+friends[youngestFriend]);

        System.out.println("The tallest among 3 friends is "+friends[tallestFriend]);
 
         in.close();

    }
}
