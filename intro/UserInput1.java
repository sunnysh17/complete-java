import java.util.*;
public class UserInput{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Two Numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a+b;
        System.out.println("Sum of two numbers: " + c);

    }   
}