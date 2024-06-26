package DAY1.OOPS.Polymorphism;

class MathOperation {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(5, 3));        // Output: 8
        System.out.println(mo.add(5, 3, 2));     // Output: 10
        System.out.println(mo.add(5.5, 3.2));    // Output: 8.7
    }   
}

