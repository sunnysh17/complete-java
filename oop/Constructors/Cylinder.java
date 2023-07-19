class Cylinder1{
    
    private double radius;
    private double height;

    public Cylinder1(){
        radius = 1;
        height = 1;
    }

    public Cylinder1(double r, double h){
        radius = r;
        height = h;
    }


    public double getHeight(){
        return height;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double r){
        radius = r;
    }

    public void setHeight(double h){
        height = h;
    }

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}


public class Cylinder{
    public static void main(String[] args) {
        Cylinder1 c1 = new Cylinder1();
        System.out.println("Lid Area: " + c1.lidArea());
        System.out.println("Perimeter: " + c1.perimeter());
        System.out.println("Drum Area: " + c1.drumArea());
        System.out.println("Volume: " + c1.volume());

    }
}