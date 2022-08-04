package ultralesson;

import java.util.Scanner;

public class lower_upperCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c>'a' && c<'z'){
            System.out.println(c+" is lowercase");
        }
        else{
            System.out.println(c+" is uppercase");
        }
    }
}
