package object.orientation;
import java.util.ArrayList;

public class fruitful {

    private String name;
    private String color;
    private String size;
    private String type;


    public static ArrayList<String>fruitsLight = new ArrayList();
    public static ArrayList<String>fruits = new ArrayList();
    public static ArrayList<String>fruitsDark = new ArrayList();
    public static ArrayList<String>fruitsDrupes = new ArrayList();
    public static ArrayList<String>fruitsBerries = new ArrayList();
    public static ArrayList<String>fruitsPomes = new ArrayList();
    public fruitful(String name,String color, String size, String type){

        this.name=name;
        this.color=color;
        this.size=size;
        this.type=type;
        sortSize.fruitSorting(name,size);

    }

public  void sortFruitBySize(String name,String size) {


}
    public  void sortFruitByType(String type) {
        System.out.println(type);
    }
    public  void sortFruitByColor(String color) {
        System.out.println(color);
    }
    public void display(){
        System.out.println("The main output is :");
        System.out.println("type : "+type+" size : "+size+" color : "+color);

        }
        public static void showData(){

            }
    public static void main(String[] args)
    {
        fruitful orange = new fruitful("orange","yellow","large","pulpy");
        fruitful cherry = new fruitful("cherry","light red","small","dry");
        fruitful grape = new fruitful("Grape","light purple","medium","berry");
        fruitful blueBerry = new fruitful("blue berry","dark blue","large","berry");
        fruitful lemon = new fruitful("lemon","orange","large","pulpy");
        fruitful apple = new fruitful("apple","red","small","dry");
        System.out.println("Fruits Sorted Based on Size:");
        System.out.println("Small Size : "+sortSize.fruitsSmall);
        System.out.println("Medium Size : "+sortSize.fruitsMedium);
        System.out.println("Large Size : "+sortSize.fruitsLarge);


    }

}