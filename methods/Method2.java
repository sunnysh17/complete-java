public class Method2
{
    static void change(int A[], int index, int value){
        
        A[index] = value;
    }

    static void change2(int x, int value){
        x=value;
    }
                   

    public static void main(String[] args) 
    {
        int A[] ={2,4,6,8,10};
        change(A,2,20);
        
        //iterate through array
        for(int x:A){
            System.out.println(x);
        }

        int x = 10;
        change2(x, 20);

        System.out.println("Value of Primitive DataType: (x)" + x); //10

    }
}