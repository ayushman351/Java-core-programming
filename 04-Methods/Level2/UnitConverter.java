package Level2;
public class UnitConverter {

    public static void main(String[] args) {
        // question 4
        double km=10;
        double miles=10;
        double feet=20;
        double meters=20;

        System.out.println(km+"Km = "+convertKmToMiles(km)+" miles");
        System.out.println(miles+" Miles = "+convertMilesToKm(miles)+" km");
        System.out.println(feet+"Feet = "+feetToMeters(feet)+" meters");
        System.out.println(meters+" Meters = "+metersToFeet(meters)+" feet");

        
        

    }
    public static double convertKmToMiles(double km){
        double km2miles=km*0.621371;
        return km2miles;
    }
    public static double convertMilesToKm(double miles){
        double miles2km=miles*1.60934;
        return miles2km;
    }
    public static double metersToFeet(double meters){
        double meters2feet=3.28084;
        return meters2feet;
    }
    public static double feetToMeters(double feet){
        double feet2meters=feet*0.3048;
        return feet2meters;
    }
}