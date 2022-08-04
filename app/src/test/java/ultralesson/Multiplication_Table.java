package ultralesson;

public class Multiplication_Table {
    public static void main(String[] args){
        int[] a={24,50,29};

        for(int i=0;i<3;i++){
            System.out.println("Table of :"+a[i]);
                for (int j=1;j<=10;j++){
                    System.out.println(a[i]+" X "+j+" = "+" "+a[i]*j);
                }
                System.out.println("********************");



        }

    }
}
