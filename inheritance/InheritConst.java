class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandChild Constructor");
    }
}

public class InheritConst{
    public static void main(String[] args) {
        // Parent p = new Parent();
        // Child c = new Child();
        GrandChild c = new GrandChild();

    }
}