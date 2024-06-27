package DAY2.Interfaces;

interface Animal {
    // Constant
    int LEGS = 4; // implicitly public, static, and final

    // Abstract methods
    void eat();
    void sleep();

    // Default method
    default void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Static method
    static void description() {
        System.out.println("Animal interface");
    }

    // Nested interface
    interface Mammal {
        void giveBirth();
    }
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void sleep() {
        System.out.println("Dog sleeps");
    }

    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.makeSound();
        Animal.description();
    }
}

