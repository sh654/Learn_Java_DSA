public class Var {
    public static void main(String  a[]){

        int num = 3;
        int num1 = 6;
        System.out.println(num * num1);
        System.out.println(num + num1);

        // double marks = 6.5;
        // byte no = 1;
        // short sh = 558;
        // long l = 567889l;
        // float f = 5.8f;
        // boolean b = true;
        
        //literals
        // char c = '8';
        int n1 = 0b101; //returns 5 in integer 
        System.out.println(n1);
        int n2 = 0X7E; //in hexa-decimal format gives 126
        System.out.println(n2);
        int n3 = 10_00_000; //returns 1000000 
        System.out.println(n3);
        System.out.println(num);


        char c = 'a';
        c++; // This increment a to b 
        System.out.println(c);

        float f1 = 5.89f;
        int x = (int)f1;
        String mss = "Is now a integer from 5.89 to 5: ";
        System.out.println(mss + x);

        // If you allocate more value than actual storage of the data type than java does modulus operation of that number to range of data type
        int a1 = 257;
        byte b1 = (byte) a1; // here max range of byte is 256 so 257%256 = 1;
        String m = "Here max range of byte is 256 so java does modulo opertion ie 257%256:";
        System.out.println(m + b1);

        // The conversion can also be represented as 
        byte bb = 56;
        byte bb1 = 2;
        int mul = bb * bb1;
        System.out.println(mul); 
    }
}
