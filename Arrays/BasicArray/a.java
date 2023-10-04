package BasicArray;
import java.util.Arrays;
import java.util.Scanner;
public class a{
public static void main(String[] args) {
    int n;        // size of array
    System.out.print("Enter value of size of array");
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    int a [] = new int[n];
    
    for(int m = 0; m<n; m++){ //element to append 
        a[m] = s.nextInt();
    }
    for(int i=0; i<a.length;i++){
        System.out.print(a[i] + " ");
    }

    
}
}