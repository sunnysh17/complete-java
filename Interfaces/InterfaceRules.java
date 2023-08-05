package Interfaces;
interface Test{
    int X = 10;
    void meth1();
    void meth2();
    public static void meth3(){
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends Test{
    void meth4();
}

class My implements Test2{
    public void meth1(){}
    public void meth2(){}
    public void meth4(){}
}

public class InterfaceRules {
    public static void main(String[] args) 
    {
        System.out.println(Test.X);     
    }
}
