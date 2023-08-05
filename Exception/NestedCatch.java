package Exception;

public class NestedCatch {
    public static void main(String[] args){
        int A[] = {10,20,30,40,0};
        try{
            int c = A[2]/A[4];
            System.out.println("Division " + c);
            System.out.println(A[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is invalid");
        }
        System.out.println("Bye!");
    }
}
