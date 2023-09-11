package Access;

public class accessarray {
    public static void main(String[] args) {
        System.out.println("Accessing elements using array in java "); 
        // To run this file as it is inside the access folder write java + Spacebar+tab 
        //u get .\accessarray.class replace class with java

        int [] arr = new int[5];
        arr = new int[] {1,2,4,5,7};
        for( int i=0;i<arr.length;i++){
            System.out.println(arr[i]); // i variable will iterate through each element and print it 
        }
    }
}
