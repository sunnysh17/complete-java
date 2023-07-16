public class Pattern1
{
    public static void main(String[] args) 
    {   
        int counter=0;
        for (int i = 1; i <= 5; i++)
        {
            for(int j=1;j<=5;j++)
            {
                counter++;
                // System.out.print(counter +" ");
                System.out.format("%02d ",counter);
            }
            System.out.println("");
        }
        
    }
}