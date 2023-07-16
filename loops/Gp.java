import java.util.Scanner;
public class Gp
{
    public static void main(String[] args) {
        int tn;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Term: ");
        int a = sc.nextInt();
        System.out.println("Enter Common Ratio: ");
        int r = sc.nextInt();
        System.out.println("Enter Number of Terms: ");
        int n = sc.nextInt();
        System.out.println("Gp Series: ");
        int term=a;
        
        for(int i=0;i<n;i++){
            System.out.print(term + ",");
            term=term*r;
        }
    }
}