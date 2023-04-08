import java.util.*;
public class Loop2 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range of natural number: ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}