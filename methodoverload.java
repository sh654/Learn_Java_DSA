class Calculator{
    public int Add(int a,int b){
        int result = a + b;
        return result;
    }

    //Suppose user want to add more than 2 number than 
    public int Add(int a, int b, int c){ // even name is same but different parrameter helps to use same class name for different operations.
        int result = a + b + c;
        return result;
        // return a+b+c;
    }

    //Same can be done with different data type
    public double Add(double a, double b){
        return a + b;
    }
}

public class methodoverload {
    public static void main(String a[]){
        Calculator obj = new Calculator(); //new object
        double result = obj.Add(5.79, 8.60); // just change the paramter and type of variable to get different result of your type
        System.out.println(result);
    }
}
