public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println("value of a:"+ a);
        System.out.println("value of b:"+ b);

        //Arithmetic operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        //unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));

        //Assignment Operators
        int f = 7;
        System.out.println("value of f:"+ f);
        System.out.println("f += 3: " + (f += 3));  //f = f+3 = 10
        System.out.println("f -= 2: " + (f -= 2));  //f = f-2 = 8
        System.out.println("f *= 4: " + (f *= 4));  //f = f*4 = 32
        System.out.println("f /= 3: " + (f /= 3));  //f = f/3 = 10
        System.out.println("f %= 2: " + (f %= 2));  //f = f%2 = 0
    }
}
