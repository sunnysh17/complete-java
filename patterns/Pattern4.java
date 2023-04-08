package patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1; row<=n; row++)
        {
            //for every row run the column
            for(int col=1; col<=row; col++)
            {
                System.out.print(col + " ");
            }
            //When one row is printed we need to add new line
            System.out.println();
        }
    }
    
}
