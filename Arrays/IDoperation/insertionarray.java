package IDoperation;
import java.util.Scanner;

public class insertionarray {
    public static void main(String[] args) {
        int n, indexToInsert; // n is length of array and  is index of insertion
        int valueToInsert; // is value to insert
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements in your array:");
        n = s.nextInt();

        int[] array = new int[n];
        int[] newArray = new int[array.length + 1];
        System.out.println("Enter Elements of Array:");
        for(int i=0; i<n; i++){
            array[i] = s.nextInt(); // for loop for inserting elements in the array
        }

        System.out.println("Enter index of new insertion");
        indexToInsert = s.nextInt();
        System.out.println("Enter value to be inserted");
        valueToInsert = s.nextInt();

        // For insertio =n we will create a new array of size n+1 to original array 
        // And then we will print it to show insertion of new Element 
        for(int i=0; i< n+1;i++){
            if(i < indexToInsert){
                newArray[i]=array[i];
            } 
            else if(i == indexToInsert){
                newArray[i] = valueToInsert; 
            } 
            else {
                newArray[i]=array[i-1];
            }
             
        }

        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }
}
