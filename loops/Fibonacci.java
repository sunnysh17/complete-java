import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Terms: ");
        int n = sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for(int i=0;i<n-2;i++){ 
            //n-2 - Because already we have printed the first two terms.
            c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
        }
    }
}