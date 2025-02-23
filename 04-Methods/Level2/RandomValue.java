package Level2;

public class RandomValue {
    public static void main(String[] args) {
        // question 12
        int size=5;
        int[] random=generateRandomArray(size);
        double[] avgMinMax=findAvgMinMax(random);

        // displaying result
        System.out.println("Average : "+avgMinMax[0]+"\nMinimum : "+avgMinMax[1]+"\nMaximum : "+avgMinMax[2]);


    }// method for generating a random array
    public static int[] generateRandomArray(int size){
        int[] random=new int[size];
        for(int i=0;i<random.length;i++){
            random[i]=(int) (Math.random()*9000)+1000;
        }return random;
    }
    // method for find avg,min and max
    public static double[] findAvgMinMax(int[] numbers){
        double sum=0;
        int min=numbers[0];
        int max=numbers[0];

         for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            min=Math.min(min, numbers[i]);
            max=Math.max(max, numbers[i]);
         }
         double avg=sum/numbers.length;
         
         return new double[]{avg,min,max};
        

        }
}
