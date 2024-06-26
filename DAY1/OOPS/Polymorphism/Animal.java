package DAY1.OOPS.Polymorphism;

class Animal {
    // Method in superclass
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Method overridden in subclass
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Method overridden in subclass
    @Override
    void sound() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog();       // Animal reference but Dog object
        Animal myCat = new Cat();       // Animal reference but Cat object

        myAnimal.sound();   // Output: Animal makes a sound
        myDog.sound();      // Output: Dog barks
        myCat.sound();      // Output: Cat meows
    }
}
