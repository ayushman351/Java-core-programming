package Level2;

import java.util.Scanner;

public class YongestAndTallest {
    public static void main(String[] args) {
        // question 8
        Scanner in=new Scanner(System.in);
        int[] age=new int[3];
        double[] height=new double[3];
        String[] friends={"Amar","Akbar","Anthony"};
        
        for(int i=0;i<3;i++){
            System.out.print("Enter age for "+friends[i]+":");
            age[i]=in.nextInt();
            System.out.print("Enter height in cm for "+friends[i]+":");
            height[i]=in.nextDouble();
        }

        // displaying result
            System.out.println("Yongest among all 3 friends is "+friends[youngestAmongFriends(age)]);
            System.out.println("Talllest among all 3 friends is "+friends[tallestAmongFriend(height)]);

        in.close();
    }

    public static int youngestAmongFriends(int age[]){
        int youngestAge=age[0];
        int youngesFriend=0;
        for(int i=0;i<age.length;i++){
            if(youngestAge>age[i]){
                youngesFriend=i;
            }
        } return youngesFriend;
    }

    public static int tallestAmongFriend(double height[]){
        double tallest=height[0];
        int tallestFriend=0;
        for(int i=0;i<height.length;i++){
            if(tallest<height[i]){
                tallestFriend=i;
            }
        }return tallestFriend;
    }
}
