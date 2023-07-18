public class SearchElement{
    public static void main(String[] args) {

        int A[] = {3,9,7,8,12,6,15,5,4,10};
        int key = 3;
        for(int i=0;i<A.length;i++){
            if(A[i] == key){
                System.out.println("Element " + A[i] + " found at index " + i);
                System.exit(0);
            }
        }
        System.out.println("Element not found");
    }
}