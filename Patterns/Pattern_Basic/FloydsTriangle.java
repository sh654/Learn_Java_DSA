package Pattern_Basic;
import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String a[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = obj.nextInt();
        System.out.println("Enter value of number:");
        int number = obj.nextInt();
        

        //outer loop row here for each row respective value is printed
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
