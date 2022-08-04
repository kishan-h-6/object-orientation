package ultralesson;

public class studentName {
    private String sName;
    public studentName(){
        sName="Unknown";
    }
    public studentName(String sName){
        this.sName=sName;
    }

    public static void  main(String[] args){
        studentName s1=new studentName();
        studentName s2=new studentName("Kishan");
       System.out.println("Student name is :"+s1.sName);
        System.out.println("Student name is :"+s2.sName);
    }
}
