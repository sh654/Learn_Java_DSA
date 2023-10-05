package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class userdef {
    // This is example of user defined ArrayList Example 
    public static void main(String[] args) {
    Scanner elements = new Scanner(System.in);
    
    System.out.println("Enter valuse in the ArrayList: ");
    ArrayList<Integer> Numbers = new ArrayList<> ();

    // here as we use add function to add elements we use for loop and ArrayList example to store input data by user;

    for(int i = 0; i < 5; i++){ // Note we can pass elements more than the size of arraylist 
        Numbers.add(elements.nextInt()); // to store value in ArrayList
    }

    for(int i = 0; i < 5; i++){
        System.out.print(Numbers.get(i) + " "); // i is index not similar syntax to what we do in array ie list[i] is invalid here
    }
    
    System.out.print(Numbers);
    }
    
 }
