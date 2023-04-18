import java.util.Scanner;
class QuadraticEqn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a, b & c: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double r1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
        double r2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a);
        System.out.println("The roots are: "+r1+" and "+r2);
    }   
}