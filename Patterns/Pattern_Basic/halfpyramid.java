package Pattern_Basic;
import java.util.Scanner;

//Logic of half pyramid is initially row no = total column 
public class halfpyramid {
    public static void main(String a[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n= obj.nextInt();
        //outer loop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){ //if i=1 then j=1 so only one star is printed
                System.out.print("*"); //
            }
            System.out.println(""); //to get new row
        }
    }
}
