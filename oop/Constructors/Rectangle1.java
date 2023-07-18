//constructors
class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(){
        length = 1;
        breadth = 1;
    }

    public Rectangle(double l, double b){
        // length = l;
        // breadth = b;
        setLength(l);
        setBreadth(b);
    }

    public Rectangle(double s){
        length = breadth = s;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }


    public void setLength(double l) {
        if(length >= 0)
            length = l;
        else
            length = 0;
    }

    public void setBreadth(double b){
        if(breadth >= 0)
            breadth = b;
        else
            breadth = 0;
    }

    public double area(){
        return  getLength()*getBreadth();
    }

    public double perimeter(){
        return 2 * (getLength() + getBreadth());
    }

    public boolean isSquare(){
        if(length == breadth){
            return true;
        }
        else{
            return false;
        }
    }
}


public class Rectangle1{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(); //Called to Default Constructor.
        Rectangle r2 = new Rectangle(10, 2); //Called toParameterized Constructor.
        
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());
        System.out.println("----------------------------------------");
        System.out.println(r2.area());
        System.out.println(r2.perimeter());
        System.out.println(r2.isSquare());

    }
}