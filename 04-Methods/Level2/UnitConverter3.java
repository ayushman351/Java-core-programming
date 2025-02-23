package Level2;

public class UnitConverter3 {
    public static void main(String[] args) {
        // question 6
        double value=100;

        // displalying result
        System.out.println(value+" farhenheit = "+convertFarhenheitToCelsius(value)+" celsius");
        System.out.println(value+" celsius = "+convertCelciusToFarhenheit(value)+" farhenheit");
        System.out.println(value+ " pounds = "+ convertPoundsToKg(value)+" kgs");
        System.out.println(value+ " kg = "+ convertkgToPounds(value)+" pounds");
        System.out.println(value+" gallons = "+convertGallonToLitres(value)+" litres");
        System.out.println(value+" litres = "+convertLitresToGallons(value)+" gallons");

    }
    public static double convertFarhenheitToCelsius(double farhenheit){
        double farhenheit2celsius=(farhenheit-32)*5/9;
        return farhenheit2celsius;
    }
    public static double convertCelciusToFarhenheit(double celsius){
        double celsius2farhenheit=(celsius*9/5)+32;
        return celsius2farhenheit;
    }
    public static double convertPoundsToKg(double pounds){
        double pounds2kg=pounds*0.453592;
        return pounds2kg;
    }
    public static double convertkgToPounds(double kg){
        double kg2pounds=kg*2.20462;
        return kg2pounds;
    }
    public static double convertGallonToLitres(double gallons){
        double gallons2litres=gallons*  3.78541;
        return gallons2litres;
    }
    public static double convertLitresToGallons(double litres){
        double litres2gallons=litres*0.264172;
        return litres2gallons;
    }
}
