import java.util.Scanner;
public class CountDigits{
    public static void main(String[] args) {
        int r = 0, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        while(n>0){
            r = n%10;
            count++;
            n=n/10;
        }
        
        System.out.println("The number of digits is "+count);
    }
}