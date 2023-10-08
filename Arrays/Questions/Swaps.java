package Questions;
import java.util.Arrays;


public class Swaps {
    public static void main(String[] args) {
        // Question to swap elements in an array bascially interchange 2 elements

        int[] arr = {1,2,3,4,5};
        swap(arr, 0, 4);

        System.out.print(Arrays.toString(arr));

    }  
    static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1]; // here value at index1 is given to temp, index1 empty
        arr[index1] = arr[index2]; // here value at index2 is given to index1, index2 empty
        arr[index2] = temp; // here value at temp is given to index2, temp empty
    }
}
