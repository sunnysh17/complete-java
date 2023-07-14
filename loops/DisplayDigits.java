import java.util.Scanner;
public class DisplayDigits{
    public static void main(String[] args) {

        int digits=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        while(num!=0){
            digits = num%10;
            num = num/10;
            System.out.println(digits);
        }   
       
    }
} 