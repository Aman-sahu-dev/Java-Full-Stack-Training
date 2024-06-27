package DAY2.InnerClasses;

abstract class AnonymousInner {
    public abstract void mymethod();
}

public class AnonymousInnerClassExample {
    public static void main(String args[]) {
        //creating a instance of Anonymous class and initializing it at same time.
        AnonymousInner inner = new AnonymousInner() {
            public void mymethod() {
                System.out.println("This is an example of anonymous inner class");
            }
        };
        inner.mymethod();
    }
}
