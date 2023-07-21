package AbstractClasses;

abstract class Shape{

    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape{
    public double radius;
    
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
        
}

class Rectangle extends Shape{
    public double length;
    public double breadth;
    
    public double perimeter(){
        return 2 * (length + breadth);
    }

    public double area(){
        return length * breadth;
    }
        
}

public class AbstractChallenge {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5;
        System.out.println("Perimeter of circle: " + c.perimeter());
        System.out.println("Area of circle: " + c.area());

        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;
        System.out.println("Perimeter of rectangle: " + r.perimeter());
        System.out.println("Area pf rectangle: " + r.area());
    }
        
}   
