public class Area{
    
    //Rectangle Method
    static double area(double l,double b){
        return l*b;
    }

    //Circle Method
    static double area(double r){
        return Math.PI*r*r;
    }

    //trapezium
    static double area(double a,double b,double h){
        double ar = ((a+b)/2)*h;
        return ar;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(area(2,4,6));
    }
}