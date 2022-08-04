package ultralesson;

import java.util.Scanner;

public class square_rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        double length=sc.nextDouble();
        System.out.println("Enter the breadth");
        double breadth = sc.nextDouble();
        if(length==breadth){
            System.out.println("The entered length "+length+" and Breadth "+ breadth +" are equal , hence its a square");
        }
        else{
            System.out.println("The rectangle has length "+length+" and breadth "+breadth);
        }
    }
}
