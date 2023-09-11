public class array{
    public static void main(String[] args) {
        int[] arr = new int[5]; 
        arr[0] = 1;
        arr[1] = 2; 
        // arr[2] = 0 as not defined so it will be by default 
        arr[3] = 4;
        arr[4] = 10;
        //To print all elements we use a loop 
        for(int i=0; i<=arr.length;i++){
            System.out.println(arr[i]);
        }       
    }
}