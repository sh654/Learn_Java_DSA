import java.util.*;
public class zeroonetriangle {
    public static void main(String a[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = obj.nextInt();

        //outer loop rows
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print(1+ " ");
                }
                else{
                    System.out.print(0+ " ");
                }
            }
            System.out.println();
        }
    }
    
}
