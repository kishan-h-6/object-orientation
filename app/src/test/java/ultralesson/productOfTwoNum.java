package ultralesson;

import java.util.Scanner;

public class productOfTwoNum {

    public int product(int a,int b){
        return (a*b);
    }
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        productOfTwoNum p =new productOfTwoNum();
        System.out.println("The product of "+a+" and "+b+" is "+p.product(a,b));


    }
}
