package Level2;

public class UnitConverter2 {
    public static void main(String[] args) {
        // question 5
        double yards=10;
        double feet=10;
        double meters=10;
        double inches=10;
        
        // displaying result
        System.out.println(yards+" yards = "+convertYardsToFeet(yards)+" feet");
        System.out.println(feet+" feet = "+convertFeetToYard(feet)+" yards");
        System.out.println(meters+" meters = "+convertMeterToInches(meters)+" inches");
        System.out.println(inches+" inches = "+ convertInchesToMeters(inches)+" meters");
        System.out.println(inches+" inches = "+convertInchesToCm(inches)+" cms");
        
    }
    public static double convertYardsToFeet(double yards){
        double yards2feet=yards*3;
        return yards2feet;
    }
    public static double convertFeetToYard(double feet){
        double feet2yard=feet*0.333333;
        return feet2yard;
    }
    public static double convertMeterToInches(double meters){
        double meters2inches=meters* 39.3701;
        return meters2inches;
    }
    public static double convertInchesToMeters(double inches){
        double inches2meters=inches*0.0254;
        return inches2meters;
    }
    public static double convertInchesToCm(double inches){
        double inches2cm=inches*2.54;
        return inches2cm;
    }
    
}
