package ArrayList;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        
        ArrayList<String> Colors = new ArrayList<>();
        // Note that <> cant hold primitives like int float we use Wrapper Classes like Integer 
 
        // To add value in list we use list.add()

        Colors.add("Red");
        Colors.add("Blue");
        Colors.add("Yellow");

        // To acess we use get()
        System.out.println(Colors.get(0)); // return Red

        // Update set()

        Colors.set(1, "Black");

        //Remove 
        Colors.remove(2);

        System.out.println("Colors in List are :");
        // iterate advanced for loop
        for(String Color: Colors){
            System.out.println(Color);
        }
    }
}
