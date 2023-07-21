class Car{

    public void start(){
        System.out.println("Car Started");
    }
    public void accelerate(){
        System.out.println("Car Accelerated");
    }
    public void changeGear(){
        System.out.println("Car Gear Changed");
    }
}

class LuxuryCar extends Car{

    public void changeGear(){
        System.out.println("automatic gear");
    }
    public void openRoof(){
        System.out.println("Roof Opened");
    }
}

public class OverridingExample2 {
  public static void main(String[] args) {
    // Car c = new Car();
    // c.start();
    // c.accelerate();
    // c.changeGear();

    // LuxuryCar c = new LuxuryCar();
    // c.start();
    // c.accelerate();
    // c.changeGear();

    Car c = new LuxuryCar();
    c.start();
    c.changeGear();
  }
}
