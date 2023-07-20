import java.util.Scanner;
public class invertedhalfpyramidnumbers {
    public static void main(String a[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = obj.nextInt();

        //outer loop rows similar to inverted half pyramid
        for(int i=n;i>=1;i--){ //as we want n numbers on 1st row we pass n to i and decrement it to 1
            for(int j=1;j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //another optimize way is if i=1 then we get 5 values 
        //and if i=2 we get 4 values ie j=n-i+1
        for(int i=1;i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
