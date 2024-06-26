package DAY1.OOPS.Abstraction;

abstract class Vehicle {
    // Abstract method (does not have a body)
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println("Vehicle stopped");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.start(); // Output: Car started
        myCar.stop();  // Output: Vehicle stopped

        myBike.start(); // Output: Bike started
        myBike.stop();  // Output: Vehicle stopped
    }
}
