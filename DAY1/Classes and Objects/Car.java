
public class Car {
    // Properties (attributes)
    String color;
    String model;
    int year;

    // Method (behavior)
    void drive() {
        System.out.println("The car is driving.");
    }
    void stop() {
        System.out.println("The car has stopped.");
    }
    // Main method to create objects
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota";
        myCar.year = 2021;

        // Use the Car object
        System.out.println("My car is a " + myCar.color + " " + myCar.model + " from " + myCar.year);
        myCar.drive();
        myCar.stop();
    }
}
