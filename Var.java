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


        //increment operators 
        a1++; //post-increment
        System.out.println(a1);
        
        ++b1; //pre-increment
        System.out.println(a1);

        //but here
        // int r = ++a1;
        // System.out.println(r); //This works because first increment and then fetch the value of it.

        int r = a1++;
        System.out.println(r); // Here it doesn't because it first fetch the value then increment it.

        int x1 = 8;
        int y1 = 7;
        // boolean res = x1 >= y1; Relational

        double aa = 1.23;
        double be = 2.22;
        boolean res = x1>=y1 && aa<=be;
        System.out.println(res);

        // conditonal statements 
        int h = 1;
        if( h > 10){ //if can hold multiple conditions like h>=10 && h<=20 gives false 
            System.out.println(h);
        } else{
            System.out.println("small statement");
        }
        
        int xx = 8;
        int yy = 7;
        int zz = 9;
        String mm = "The greatest is: ";
        // To get max of them 
        if(xx>yy && xx>zz){
            System.out.println(mm+xx);
        } else if(yy>zz){ // zJust to increase efficiency of code we wont compare yy with zz think about it by looking at above condition 
            System.out.println(mm + yy);
        } else{
            System.out.println(mm + zz);
        }
        //Ternary operator ?:
        int nn = 44;
        int resnn = 0;
        /* 
         * if(n%2==0)
         *      result = 10;
         * else 
         *      result = 20;
        */

        resnn = nn%2==0 ? 10 : 20;
        System.out.println(resnn);
    }
}
