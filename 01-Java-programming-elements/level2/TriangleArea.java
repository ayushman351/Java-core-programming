package level2;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // question 2

        Scanner in=new Scanner(System.in);
        float height=in.nextFloat();
        float base=in.nextFloat();

        float areaInSqInches=(1.0f/2)*base*height;
        float areaInSqCms=areaInSqInches*2.54f*2.54f;
        System.out.println("Area of triangle in Square inches is "+areaInSqInches+" and in Square centimeters is "+areaInSqCms);

        in.close();
    }
}
