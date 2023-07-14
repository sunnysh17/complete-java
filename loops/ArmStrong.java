import java.util.Scanner;
public class ArmStrong{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int m = n;
        int r, sum=0;
        while(n>0){
            r = n%10;
            sum = sum + r*r*r;
            n = n/10;   
        }
        if(m == sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }

}
}