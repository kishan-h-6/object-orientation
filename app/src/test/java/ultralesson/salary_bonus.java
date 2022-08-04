package ultralesson;

import java.util.Scanner;

public class salary_bonus {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Employee Service Years");
        double years=sc.nextDouble();
        System.out.println("Enter Employee Salary");
        double salary=sc.nextDouble();
        double newSalary=0;
        if(years>5){
            newSalary=salary+(salary/20);
            System.out.println("Salary of employee who's worked for more than 5 years is :"+newSalary);
        }
        else{
            System.out.println("Salary of employee is "+salary);
        }
    }
}
