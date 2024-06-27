package DAY2.InnerClasses;

public class StaticNestedClassExample {

    private static String message = "Hello from the Outer Class!";

    static class StaticNestedClass {
        void display() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        StaticNestedClassExample.StaticNestedClass nested = new StaticNestedClassExample.StaticNestedClass();
        nested.display(); // Output: Hello from the Outer Class!
    }
}

/*
''' OuterClass.StaticNestedClass: ''''

This syntax is used to refer to the StaticNestedClass inside OuterClass. It's like saying "the StaticNestedClass that's defined inside OuterClass".

-------------------------------------------------------------------------
''' new OuterClass.StaticNestedClass(): ''''

This creates a new instance of StaticNestedClass without needing an instance of OuterClass.

 */
