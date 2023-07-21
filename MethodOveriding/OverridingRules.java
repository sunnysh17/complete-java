class Super{
    public void display(){
        System.out.println("Super Display");
    }
}

class Sub extends Super{
    public void display(){
        System.out.println("Sub Display");
    }
    
}

public class OverridingRules {
    public static void main(String[] args) {
      Super sup = new Sub(); 
      sup.display();
    }
}
