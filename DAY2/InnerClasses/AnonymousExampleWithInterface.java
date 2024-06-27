package DAY2.InnerClasses;

interface Greeting {
    void sayHello();
}

public class AnonymousExampleWithInterface {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from the Anonymous Inner Class!");
            }
        };
        greeting.sayHello();  // Output: Hello from the Anonymous Inner Class!
    }
}
