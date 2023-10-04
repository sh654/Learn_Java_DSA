package Strings;

import java.util.Arrays;
import java.util.Scanner;
public class BasicString {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String [] arr = new String[5];
    // Now String is non primitive it coulde be set to null as follow
    arr = null;
    arr  =new String[] {"Hi", "john", "How", "are","you"};
    // but primitive could not set to null 
    // int ne = null; 
    System.out.println();
    arr[1] = "baby";  // as arr is array it could be changed but the data type it holds is string 
    System.out.println("Use of for loop");
    for(int i =0; i< arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.println("use of forEach");
    // use of for Each
    for(String ar : arr){
        System.out.print(ar + " ");
    }
    System.out.println();
    // simple and best way to print string of arrays
    // System.out.println(Arrays.toString(arr)); // returns [Hi, john, How, are, you] in format 

    String[] str = new String[4];
    System.out.println("Enter value of Str :");
    for(int i =0; i<str.length; i++){
        str[i] = s.next();
    }
    System.out.print(Arrays.toString(str));

    // Note String are imutable in Java And array are mutable

    String a = "Hello";
    System.out.print(a);
    // System.out.print(a[0] == w);  error as String are immutable 

    
    }
}
