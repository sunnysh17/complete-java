class Super{
    public void display(){
        System.out.println("Hello");
    }
}

class Sub extends Super{
    public void display(int x){
        System.out.println("Hello Welcome");
    }
}

public class Overriding{
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();

        Sub sub = new Sub();
        sub.display(10);
        
        Super su = new Sub(); //Method of the object is called
        su.display();
    }
}