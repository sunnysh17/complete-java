public class MaxVarargs{
    
    static int max(int ...A){
        if(A.length == 0) 
            return Integer.MIN_VALUE;
        int max = A[0]; //Assume first element of array is the max.
        for(int i = 1; i < A.length; i++){
            if(A[i] > max)
                max = A[i];
        }
        return max;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10,20));
        System.out.println(max(1,4,56,45));
    }   
}