class Tv
{
    public void switchOn(){
        System.out.println("TV is switched On");
    }

    public void changeChannel(){
        System.out.println("TV Channel is changed");
    }
}

class smartTv extends Tv{
    
    public void switchOn(){
        System.out.println("Smart Tv is switched On");
    }

    public void changeChannel(){
        System.out.println("Smart TV Channel is changed");
    }

    public void browse(){
        System.out.println("Smart TV is browsing");
    }
}

public class OverridingExample1 {
    public static void main(String[] args) {
        // Tv t = new Tv();
        // t.switchOn();
        // t.changeChannel();
        // smartTv t = new smartTv();
        // t.switchOn();
        // t.changeChannel();
        // t.browse();

        Tv t  = new smartTv();
        t.switchOn();
        t.changeChannel();
        // t.browse();
    }
}
