package ultralesson;

import java.util.Scanner;

public class discount10 {
    public static void main(String[] args){
        int price=100;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the quantity : ");
        int quantity=sc.nextInt();
        double total=price*quantity;
        if(quantity*price>1000){

            System.out.println("Total cost with discount "+(total-(total/10)));
        }
        else{
            System.out.println("Total cost without discount "+total);
        }

    }
}
