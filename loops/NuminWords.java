import java.util.Scanner;
public class NuminWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int r;
        String str="";
        while(n>0){
            r = n%10;
            n = n/10;
            str = str+r;
        }
        System.out.println(str);
        char c;
        for(int i=str.length()-1;i>=0;i--){
            c = str.charAt(i);
            swtich(c){
                case '0':
                System.out.println("Zero"); 
                break;

            }
            
        }
}
}
