package ultralesson;

import java.util.Scanner;

public class marks {
    public String grade(int mark){
      if(mark>90 && mark<=100){
          return "AA";
      } else if (mark>80 && mark<=90) {
          return "AB";
      }
      else if(mark>70 && mark<=80){
          return "BB";
      }
      else if(mark>60 && mark<=70){
          return "BC";
      }
      else if(mark>50 && mark<=60){
          return "CD";
      }
      else if (mark>40 && mark<=50) {
          return "DD";
      }
      else if(mark>0 && mark<=40)
      {
          return "Fail";
      }
      else {
          return "Wrong input";
      }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student marks");
        int m=sc.nextInt();
        marks student=new marks();
        System.out .println(student.grade(m));

    }
}
