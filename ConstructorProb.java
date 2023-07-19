class Test{
    int y  = 5;
    public Test(){
        System.out.println("Default Constructor" + y);
    }

    public Test(int x){
        y = x;
        System.out.println("Param Constructor" + y);
    }
}

public class ConstructorProb{
    public static void main(String[] args) {
        Test t1 = new Test(10); //Anonymous Object
        Test t2 = new Test();
    }
}