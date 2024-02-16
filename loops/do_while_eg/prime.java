package loops.do_while_eg;
public class prime {
    public static void main(String[] args) {
        int a = 10;
        do{
            if(a%2==0){
                System.out.println(a);
            }
            ++a;
        } while(a<=100);
    }
}
