class Part1{
    public static void main(String[] args) {
        int a = 14;
        int b = 5;
        float c = 14.3f;
        float d = 3.2f;
       
        float e = (float) a/b; // typecasting
        
        float r = c%d; 

        System.out.println(e);
        System.out.println(r);

        char p = 40;
        char q = 30;
        int s = p-q;
        System.out.println("s: " + s);
    }
}