public class Varargs{
   
    static void show(int ...A)
    {
        for(int a:A){
            System.out.println(a);
        }
    }

    // static void show(int A[])
    // {
    //     for(int a:A){
    //         System.out.println(a);
    //     }
    // }
    public static void main(String[] args)
    {
        show(null);
        //show(10,20,30); //All these 3 values will be passed as an single array
        show(new int []{3,5,7,9,11,13,15});
    }
}