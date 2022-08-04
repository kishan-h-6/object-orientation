package ultralesson;

import java.util.Scanner;

public class max_min_threeNumbers {
    public int maxNumber(int a,int b,int c){
        if(a>b && a>c){
            return a;
        } else if (b>a && b>c) {
            return b;
        }
        else {
            return c;
        }
    }

    public int minNumber(int a,int b,int c){
        if(a<b && a<c){
            return a;
        } else if (b<a && b<c) {
            return b;
        }
        else {
            return c;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 numbers one by one");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        max_min_threeNumbers m=new max_min_threeNumbers();
        System.out.println("The maximum number in the given list of numbers is "+m.maxNumber(a,b,c));
        System.out.println("The minimum number in the given list of numbers is "+m.minNumber(a,b,c));
    }
}
