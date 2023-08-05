package Exception;

public class ExceptionPrac1 {
    public static void main(String[] args){
        int a=10,b=0,c;

        try{
            c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be zero, please try again");
        }
        System.out.println("Bye!");

        
    }
}
