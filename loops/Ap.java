import java.util.Scanner;
public class Ap{
    public static void main(String[] args) {
        int tn;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Term: ");
        int a = sc.nextInt();
        System.out.println("Enter Common Difference: ");
        int d = sc.nextInt();
        System.out.println("Enter Number of Terms: ");
        int n = sc.nextInt();
        System.out.println("Ap Series: ");
        for(int i=1;i<=n;i++){
            tn = (a + ((i-1) * d));
            System.out.print(tn + ", ");
        }
    }
}