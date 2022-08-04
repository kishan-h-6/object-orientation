package ultralesson;

import java.util.Scanner;

public class gcd_hcf {
    public static int getGcd(int a, int b)
    {
        while(b != 0)
        {
            if(a > b)
            {
                a = a - b;
            }
            else
            {
                b = b - a;
            }
        }
        return a;
    }
    static int getHcf (int num1, int num2)
    {
        if (num1 == 0){
            return num2;}
        if (num2 == 0){
            return num1;}
        if (num1 == num2){
            return num1;}
        if (num1 > num2){
            return getHcf (num1 - num2, num2);}
        return getHcf (num1, num2 - num1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b=sc.nextInt();
        System.out.println("The GCD of "+a+" and "+b+" = "+ getGcd(a,b));
        System.out.println("The HCF of "+a+" and "+b+" = "+ getHcf(a,b));
    }
}
