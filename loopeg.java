public class loopeg {
    public static void main(String a[]){
        /* 1st while */
        int i =1;
        while(i<5)
        {
            System.out.println("Hi" + i);
            //nested loop
            int j = 1;
            while(j<=3) //nested loop will execute 3 times then main loop and in loop again till i=5 
            {
                System.out.println("Hello");
                j++;
            }
            
            i++;
        }
        System.out.println("Bye" + i); //returns 5 as i is already incremented at last stage of while and that i is used here.

        /*2 Do while Loop */

        do{
            System.out.println("Do while Example" + i); //i=5 condition doesnt match with below while though it will execute.
            i++;
        } while(i<=3);

        /*3 For loop */
        for(int k=1;k<=5;k++){
            System.out.println("Hi" + k);
        }

        //easy build of different pattern in our program
        for(int k=4;k>=1;k--){
            System.out.println("Hello" + k);
        }

        for(int ab=1;ab<=5;ab++){
            System.out.println("Day" + ab);

            for(int bc=1; bc<=9;bc++){
                System.out.println(" " + (bc+8)+ "-" + (bc+9));
            }
        }

        // Now which one to use.
        /* Most case for is best as it is more efficient and frequency to use in less lines
         * While working with database and files always recommended to use while 
         */
    }
}
