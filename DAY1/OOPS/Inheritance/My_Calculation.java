package DAY1.OOPS.Inheritance;

class Calculation {
    int result;

    public void addition(int x, int y) {
        result = x + y;
        System.out.println("The sum of the given numbers: " + result);
    }

    public void Subtraction(int x, int y) {
        result = x - y;
        System.out.println("The difference between the given numbers: " + result);
    }
}

public class My_Calculation extends Calculation {
    public void multiplication(int x, int y) {
        result = x * y;
        System.out.println("The product of the given numbers: " + result);
    }

    public static void main(String args[]) {
        int a = 20, b = 10;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
    }
}
