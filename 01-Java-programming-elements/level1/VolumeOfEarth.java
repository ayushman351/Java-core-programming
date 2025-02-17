public class VolumeOfEarth {

    public static void main(String[] args) {
        // question 7

        long radiusKm=6378;
        float radiusMil=radiusKm/1.6f;
        double volKM=(4.0/3.0)*(3.14)*(radiusKm*radiusKm*radiusKm) ;
        double volMil=(4.0/3.0)*(3.14)*(radiusMil*radiusMil*radiusMil);
        System.out.println("The volume of earth in cubic kilometers is "+volKM+" and cubic miles is "+volMil);
    }
}