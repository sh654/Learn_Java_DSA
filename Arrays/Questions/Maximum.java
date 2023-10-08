package Questions;

// To check maximum element of the array
public class Maximum {
    public static void main(String[] args) {
        int [] arr = {1,2,23,9,18};
        int [] array = new int[5];

        System.out.println("Maximum Element of given value in array : ");
        System.out.println(max(arr));
        System.out.println("Maximum Element from an empty array : ");
        System.out.println(max(array));
        System.out.println("Maximum Element from an particular range of array : ");
        System.out.println(maxRange(arr, 2, 4));
        System.out.println(maxRange(array, 3, 4));
    }

    // Here this class takes all element of array and find maximum of it 
    static int max(int[] arr){
        int maxval = arr[0]; // Here consider arr is empty then maxval = Integer.MAX_VALUE;
       
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }

    // To find maximum element in array for particular range we use such function
    // Also work on edge case like array being null
    static int maxRange(int[] arr, int start, int end){ //start takes inital value of range and end takes final 
        
        if(end < start){
            return -1;
        }

        if(arr == null){
            return -1;
        }

        int maxOfRange = arr[0];
        for(int i= start; i<= end; i++){
            if(arr[i] > maxOfRange){
                maxOfRange = arr[i];
            }
        }
        return maxOfRange;
    }
    
}
