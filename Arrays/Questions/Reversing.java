package Questions;

import java.util.Arrays;

// Reversing elements in an array 
public class Reversing {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        System.out.println("Reverse of" + Arrays.toString(arr) + "is:"); 
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){ // while loop is uesful as it does swapping for both even and odd length of array
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
