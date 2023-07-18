class Computer{
    public void playMusic(){
        System.out.println("Music is playing");
    }

    public String getMeAPen(int cost){
        String result = (cost>=10) ?"Pen" : "Nothing";
        return result;
    }
}

public class maineg{
    public static void main(String a[]){
        Computer obj = new Computer(); //created new object
        obj.playMusic();
        String result = obj.getMeAPen(1);
        System.out.println(result);
    }
}