package ultralesson;

import java.util.Scanner;

public class occurrenceString {
    public static void main(String[] args){
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        int first=0;
        int last=-1;
        for(int i=0;i<str1.length();i++){
           if(str1.charAt(i)=='o' && flag==false){
               first=i;
               last=i;
               flag=true;
           }
           if(str1.charAt(i)=='o'){
               last=i;
           }
        }
        System.out.println("First occurrence of 'o' : "+first);
        System.out.println("Last occurrence of 'o' : "+last);
    }
}
