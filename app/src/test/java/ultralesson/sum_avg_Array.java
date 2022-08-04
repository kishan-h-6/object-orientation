package ultralesson;

import java.util.Scanner;

public class sum_avg_Array {
    public static void main(String[] args){
        int sum=0;
        int prod=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=a[i];
            prod*=a[i];
        }
        System.out.println("Sum of all the elements in the array "+sum);
        System.out.println("Product of all the elements in the array "+prod);

    }
}
