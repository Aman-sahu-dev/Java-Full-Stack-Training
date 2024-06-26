package DAY1.OOPS.Inheritance;

// Define the superclass Vehicle
class Vehicle {
    String brand;

    void honk() {
        System.out.println("Beep beep!");
    }
}

// Define the subclass Car that inherits from Vehicle
class Car extends Vehicle {
    String modelName;

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + modelName);
    }

    public static void main(String[] args) {
        //Child class object
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.modelName = "Corolla";
        myCar.honk();
        myCar.display();
    }
}
