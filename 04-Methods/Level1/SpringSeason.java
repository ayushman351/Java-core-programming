    package Level1;

    import java.util.Scanner;

    public class SpringSeason {
        public static void main(String[] args) {
            // question 6

            Scanner in=new Scanner(System.in);
            System.out.println("Enter month number below(1-12)");
            int month=in.nextInt();
            System.out.println("Enter day(1-31)");
            int day=in.nextInt();

            isSpring(month,day);

            in.close();

        }
        public static void isSpring(int month,int day){
            if(month>3&&month<6){
            System.out.println("It's a spring season");
            }else if(month==3){
                if(day>=20){
                    System.out.println("It's a spring season");
                }else{
                    System.out.println("Not a spring season");
                }
            }else if(month==6){
                if(day<=20){
                    System.out.println("It's a spring season");
                }else{
                    System.out.println("Not a spring season");
                }
            }else{
                System.out.println("Not a spring season");
            }
        }
    }
