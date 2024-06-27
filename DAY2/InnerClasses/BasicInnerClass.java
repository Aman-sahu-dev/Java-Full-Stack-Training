package DAY2.InnerClasses;

class OuterClass {
    private String message = "Hello from the Outer Class!";

    class InnerClass {
        void display() {
            System.out.println(message);
        }
    }
}
public class BasicInnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();  // Output: Hello from the Outer Class!
    }
}

/*
OuterClass.InnerClass:

This syntax is used to refer to the InnerClass inside OuterClass. It's like saying "the InnerClass that's defined inside OuterClass".
----------------------------------------------------------------
outer.new InnerClass():

outer: This is an instance of OuterClass.
new InnerClass(): This creates a new instance of InnerClass.
outer.new InnerClass(): When combined, this means "create a new instance of InnerClass associated with the instance outer of OuterClass".
----------------------------------------------------------------
 */


