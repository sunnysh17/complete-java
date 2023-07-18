class Circle{
    public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }
}

public class Circle1{
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.radius = 5;
        c2.radius = 14;

        System.out.println("Area1: " + c1.area());
        System.out.println("Circumference1: " + c1.circumference());
        System.out.println("-----------------------------------------");
        System.out.println("Area2: " + c2.area());
        System.out.println("Circumference2: " + c2.circumference());
    
    }
}