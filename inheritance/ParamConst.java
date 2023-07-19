class Parent{

    Parent(){
        System.out.println("Non-Param of Parent");
    }
    Parent(int x){
        System.out.println("Param of Parent " + x);
    }
}

class Child extends Parent{
    Child()
    {
        System.out.println("Non-Param of Child");
    }
    Child(int y)
    {
        System.out.println("Param of Child");
    }
    Child(int x, int y){
        super(x);
        System.out.println("2 Param of Child " + y);
    }
}

public class ParamConst{
    public static void main(String[] args) {
        Child c = new Child(10,20);
    }
}