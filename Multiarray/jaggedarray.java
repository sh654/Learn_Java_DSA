public class jaggedarray {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][]; //jagged array 
        
        // Initialize the sub-arrays with different lengths
        jaggedArray[0] = new int[] { 1, 2, 3 }; 
        jaggedArray[1] = new int[4]; // Note 1 is array number in 3D array and 4 is its length 
        jaggedArray[2] = new int[1];
        
        // Access and print elements of the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (int)(Math.random() * 100);
            }
             // Move to the next line after each row
        }

        for(int n[]: jaggedArray){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
            
    }
}
