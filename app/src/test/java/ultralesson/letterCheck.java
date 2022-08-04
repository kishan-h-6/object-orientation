package ultralesson;

import java.util.Scanner;

public class letterCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.indexOf('e')>=0){
            System.out.println(" 'e' is present in the string at "+s.indexOf('e'));
        }
        else{
            System.out.println("'e' is not present in the string");
        }

    }
}
