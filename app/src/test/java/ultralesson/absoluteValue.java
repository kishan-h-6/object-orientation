package ultralesson;

import java.util.Scanner;


public class absoluteValue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer number");
        int n=sc.nextInt();
        System.out.println("The absolute value of "+n+" is "+Math.abs(n));
    }
}
