package ultralesson;

import java.util.Scanner;

public class avg_10num {
    public static void main(String[] args){
        int[] a=new int[10];
        double avg=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter No."+i);
            a[i]=sc.nextInt();
            avg+=a[i];
        }
        System.out.println("Average of the 10 numbers : "+avg/10);
    }
}
