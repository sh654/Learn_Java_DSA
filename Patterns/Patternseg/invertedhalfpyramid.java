import java.util.Scanner;

public class invertedhalfpyramid {
    public static void main(String a[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = obj.nextInt();
        //outer loop  
        for(int i=n;i>=1;i--){ //here as long as i>0 we will print the star so in bottom get only 1 star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
