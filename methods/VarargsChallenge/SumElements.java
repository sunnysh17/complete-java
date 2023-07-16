public class SumElements{
    
    static int sumNum(int ...A){
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
        }
        return sum;
    }
    
    
    
    public static void main(String[] args) {

        System.out.println(sumNum(10,20));

    }
}