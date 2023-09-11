package IDoperation;
import java.util.Scanner;
public class deletearray {
    public static void main(String[] args) {
        System.out.println("Enter size of Array: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 

        // logic of deletion of array in java 
        // we create a new array of length-1 to og array and store elements of ogarray in new array
        
        int[] originalArray = new int[n];
        int [] newArray = new int[originalArray.length - 1];
        System.out.println("Enter elements of array: ");
        for(int i=0; i< originalArray.length; i++){
            originalArray[i] = s.nextInt();
        }

        // Deletion of element form array
        System.out.println("Enter Position of Deletion: "); 
        int positionToDelete = s.nextInt(); // index at which element is delted .
        for(int i=0; i<n; i++){
            if(i < positionToDelete){
                newArray[i] = originalArray[i];
            } else if (i == positionToDelete) {
                continue; 
            } else{
                newArray[i-1] = originalArray[i]; 
                // i-1 means skip index from ogarray and take new value from next index
            }
        }

        System.out.println("New Array is :");
        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }
}
