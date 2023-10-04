import java.util.Arrays;
import java.util.Scanner;
public class Twodim {
    public static void main(String[] args) {
        System.out.println("Enter the values of array : ");
        Scanner s = new Scanner(System.in);

        int [] [] twodimensional = new int [3] [3];

        // Access and putting elements of array 
        for(int i =0; i < twodimensional.length; i++){ // i is rows of 2-D array ie array in array
            for(int j =0; j < twodimensional[i].length; j++){ // j is column ie elements in array
                twodimensional[i][j] = s.nextInt();
            }

        }

        // Printing 2-D array
        for(int[] n : twodimensional){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // Above printing could be made more good using Arrays.toString[] method
        for(int i = 0; i < twodimensional.length ; i++){
            System.out.println(Arrays.toString(twodimensional[i]));
        }
    }
}
