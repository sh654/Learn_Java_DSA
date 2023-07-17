class Calculator{
    public int add(int a , int b){
        int r = a + b;
        return r;
    }
}

public class classeg {
    public static void main(String a[]){
        int n = 1;
        int m = 2;

        Calculator calc = new Calculator(); //created an object
        int result = calc.add(n,m);
        // int result = n + m;
        System.out.println(result); //Normal way of printing addition of 2 numbers
    }
}
