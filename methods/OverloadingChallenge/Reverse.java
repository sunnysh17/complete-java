public class Reverse{

    static int reverse(int n){
        int rev = 0,r;
        while(n>0){
            r = n%10;
            rev = rev*10 +  r;
            n = n/10;
        }
        return rev;
    }

    int [] reverse(int A[]){
        int B[] = new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++){
            B[j] = A[i];
        }
        return B;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}