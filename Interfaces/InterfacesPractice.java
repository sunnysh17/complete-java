package Interfaces;

interface Test
{

    void meth1();
    void meth2();
}

class My implements Test{

    public void meth1(){
        System.out.println("meth1 of my");
    }
    public void meth2(){
        System.out.println("meth2 of my");
    }
    public void meth3(){
        System.out.println("meth3 of my");
    }
       
         
}

public class InterfacesPractice {
    public static void main(String[] args) {
        Test t;
        t = new My();
        t.meth1();
        t.meth2();
       // t.meth3();
    }
        
        
}
