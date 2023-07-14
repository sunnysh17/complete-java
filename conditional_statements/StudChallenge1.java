import java.util.Scanner;
public class StudChallenge1{
    public static void main(String[] args) {
        //Find radix of a given number in a string
        Scanner sc = new Scanner(System.in);
        String num;
        System.out.println("Enter a number: ");
        num = sc.nextLine();

        if(num.matches("[01]+")){
            System.out.println("The radix is 2: Binary");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("The radix is 8: Octal");
        }
        else if(num.matches("[0-9]+")){
            System.out.println("The radix is 10: Decimal");
        }
        else if(num.matches("[0-9A-F]+")){
            System.out.println("The radix is 16: Hexadecimal");
        }   
        else{
            System.out.println("Invalid input");
        }
    }
}