public class TwoDimensionalArray {
    public static void main(String[] args) {

        int A[][] = new int[5][5];

        //3x3 matrix
        int B[][] = {{1,2,3},{2,4,6},{1,3,5}};
        System.out.println(B.length); //will return no of rows

        int C[][];
        C = new int[3][3];

        int []D[] = new int[4][4]; //valid

        //Display 
        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("--------------------------------------");

        //Display using forEach loop
        for(int x[]:B){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------");
        //Jagged Array
        int E[][];
        E = new int[3][];
        E[0] = new int[5];
        E[1] = new int[3];
        E[2] = new int[8];

        for(int i=0;i<E.length;i++){
            for(int j=0;j<E[i].length;j++){
                System.out.print(E[i][j]+" ");
            }
            System.out.println("");
        }
    }
}