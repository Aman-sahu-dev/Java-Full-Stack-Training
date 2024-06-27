package DAY2.AbstractClasses;

// Abstract class
abstract class Vehicle {
    // Field
    String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method (no body)
    abstract void honk();

    // Concrete method
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass (inherits from Vehicle)
class Car extends Vehicle {
    // Constructor
    public Car(String brand) {
        super(brand); /* Call the constructor
                 of the superclass (Vehicle)  */
    }

    // Implementing the abstract method
    void honk() {
        System.out.println("Car honks: Beep beep!");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        myCar.displayBrand();  // Output: Brand: Toyota
        myCar.honk();          // Output: Car honks: Beep beep!
    }
}
