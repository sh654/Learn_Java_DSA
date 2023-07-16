import java.util.Scanner;

public class switcheg {
    public static void main(String a[]){
        //using switc statemnt 
        Scanner myObj = new Scanner(System.in); //taking user input
        
        System.out.println("Enter username"); 
        int n = myObj.nextInt(); // storing input in int variable 
        switch(n){
            case 1:
                System.out.println("Monday");
            break;
            case 2: 
                System.out.println("Tuesday");
            break;
            case 3:
                System.out.println("Wednessday");
            break;
            case 4:
                System.out.println("Thursday");
            break;
            case 5:
                System.out.println("Friday");
            break;
            case 6:
                System.out.println("Saturday");
            break;
            case 7:
                System.out.println("Sunday");
            break;
            default:
                System.out.println("Enter a valid number");
        }
    }
}
