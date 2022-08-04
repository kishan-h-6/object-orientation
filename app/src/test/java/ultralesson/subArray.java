package ultralesson;

import java.util.Scanner;

public class subArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a={10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        System.out.println("Enter the range for sub array from start to finish " );
        int start=sc.nextInt();
        int finish= sc.nextInt();
        System.out.print("[");
        for(int i=start;i<=finish;i++)
            System.out.print(" "+a[i]);
        System.out.print(" ]");
    }
}
