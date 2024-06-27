package DAY2.InnerClasses;

public class MetholocalInnerClass {
    void display() {
        final String message = "Hello from the Local Inner Class!";

        class LocalInnerClass {
            void printMessage() {
                System.out.println(message);
            }
        }

        LocalInnerClass local = new LocalInnerClass();
        local.printMessage();  // Output: Hello from the Local Inner Class!
    }

    public static void main(String[] args) {
        MetholocalInnerClass outer = new MetholocalInnerClass();
        outer.display();
    }
}


