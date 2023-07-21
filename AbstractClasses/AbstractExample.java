package AbstractClasses;

abstract class Super{
    public Super(){
        System.out.println("Super Constructor");
    }
    public void meth1(){
        System.out.println("Meth1 of Super Class");
    }
    abstract public void meth2();
}

class Sub extends Super{
    //Overriding the method
    public void meth2(){
        System.out.println("Meth2 of Sub Class");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Super s;
        Sub sub = new Sub();
        sub.meth2();
        sub.meth1();
    }
}
