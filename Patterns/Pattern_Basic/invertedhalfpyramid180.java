import java.util.Scanner;
public class invertedhalfpyramid180 {
    public static void main(String a[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = obj.nextInt();

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop1 use to print space
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop2 use to print *
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }

            //to print on new line 
            System.out.println();
        }
    }
}
