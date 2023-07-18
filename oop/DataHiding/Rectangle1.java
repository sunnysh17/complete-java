class Rectangle {
    private double length;
    private double breadth;


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
        Rectangle r1 = new Rectangle();
        // r1.length = 5; ---> Data is hidden(private)
        // r1.breadth = 8;
        r1.setLength(10.5);
        r1.setBreadth(5.5);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());
        System.out.println("Length: " + r1.getLength());
        System.out.println("Breadth: " + r1.getBreadth());

    }
}