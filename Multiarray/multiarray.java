public class multiarray{
    public static void main(String[] args) {
        int nums[] []= new int[3] [4];
        //fetching random values using Math class and random function to get elements for array
        for(int i=0; i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j] = (int)(Math.random() * 100);
                // note since random gives in decimal value of format 0.04 we multiply by 100 to get double value 
                // then use type casting to get value 
            }
        }
        System.out.println("Print of Basic for Loop:");
        for(int i=0; i<3;i++){ 
            // outer index of array 
            for(int j=0; j<4; j++){
                System.out.print(nums[i][j] + " "); //inner elements of array 
            }
            System.out.println();
        }

        System.out.println("Use of Enhanced For Loop");

        // in case of enhanced syntax no need to know the value of dimension of array 
        for(int n[]: nums){ //n is 1-d array from nums 
            for(int m : n){ // m extract elements from n
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
        
}