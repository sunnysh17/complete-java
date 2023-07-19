class Circle{
    public double radius;

    public Circle(){
        radius = 0.0;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle{
    public double height;

    public Cylinder(){
            height = 0.0;
    }
    public double volume(){
        return area()*height;
        //borrowing area from circle
    }
}

public class Circle1{
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        c1.radius = 7;
        c1.height = 10;
        System.out.println("Volume: " + c1.volume());
        System.out.println("Area: " + c1.area());

    }
}