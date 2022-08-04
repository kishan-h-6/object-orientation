package object.orientation;

import java.util.ArrayList;

public class sortSize {
    public static ArrayList<String> fruitsSmall = new ArrayList();
    public static ArrayList<String>fruitsMedium = new ArrayList();
    public static ArrayList<String>fruitsLarge = new ArrayList();
    public static String fruitSorting(String name, String size){
        if(size.equals("small")||size.equals("Small")||size.equals("SMALL")){
            return("small");
        }
        else if (size.equals("medium")||size.equals("Medium")||size.equals("MEDIUM")) {
            return("medium");

        }
        else{
           return ("large");
        }
    }

}
