package Pattern_Basic;
import java.util.Scanner;

public class halfpyramidwithnumber {
    public static void main(String a[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = obj.nextInt();
        //Logic for each row if i=1 then we print 1 if i=2 then 1 2 and so on
        //outer loop = rows 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
        System.out.println();
        }
    }
}
