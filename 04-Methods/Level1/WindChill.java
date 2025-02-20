package Level1;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        // question 11 
        Scanner in=new Scanner(System.in);
        System.out.println("enter temperature(°F)");
        double temperature=in.nextDouble();
        System.out.println("enter wind speed (mph)");
        double windSpeed=in.nextDouble();

        double windChill=calculateWindChill(temperature, windSpeed);
        System.out.println("wind chill temperature is "+windChill);

        in.close();

    }public static double calculateWindChill(double temperature, double windSpeed){
        double windChill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(windSpeed, 0.16);
        return windChill;
    }
    
}
