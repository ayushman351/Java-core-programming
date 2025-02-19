package Level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // question 1
        
        Scanner in=new Scanner(System.in);
        int employees=10;
        double[] salary=new double[employees];
        double[] serviceYears=new double[employees];
        double[] bonus=new double[employees];
        double[] newSalary=new double[employees];


        // taking user input for salary and years of service
        
        for(int i=0;i<employees;i++){
            System.out.println("Enter salary for employee "+(i+1));
            double salaryInput=in.nextDouble();
    
            System.out.println("Enter service years for employee "+(i+1));
            double yos=in.nextDouble();
            if(salaryInput<0||yos<0){
                System.out.println("Invalid salary or years of service, enter again ");
                i--;
                continue;
            }
            salary[i]=salaryInput;
            serviceYears[i]=yos;
          
        }
        // calculating bonus and new salaries as well as total bonus, total old and new salary paid by company
        double totalSalary=0;
        double totalNewSalary=0;
        double totalBonus=0;

        for(int i=0;i<employees;i++){
            if(serviceYears[i]>=5){
                bonus[i]=5;
            }else{
                bonus[i]=2;
            }
            newSalary[i]=salary[i]+(salary[i]*bonus[i]/100);
            totalBonus=bonus[i]+totalBonus;
            totalSalary=salary[i]+totalSalary;
            totalNewSalary=newSalary[i]+totalNewSalary;
        }
        // displaying result
        for(int i=0;i<employees;i++){
            System.out.println("Details of employee "+(i+1)+" bonus: "+bonus[i]+", old salary: "+salary[i]+", new salary: "+newSalary[i]);
            if(i==employees-1){
                System.out.println("-------------------------------------");
                System.out.print("Total bonus payout by company: "+totalBonus+"%"+"\nTotal old salary of employees: "+totalSalary+"\nTotal new salary of employees: "+totalNewSalary);
            }
        }in.close();

    }
}
