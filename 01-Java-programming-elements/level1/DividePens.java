public class DividePens {
    public static void main(String[] args) {
        // question 5

        int pens=14;
        int students=3;
        int pensEachStudentGet=pens/students;
        int remaining=pens%students;
        System.out.println("The Pen Per Student is "+pensEachStudentGet+" and the remaining pen not distributed is "+remaining);
    }
    
}
