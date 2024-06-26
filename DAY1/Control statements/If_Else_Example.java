public class If_Else_Example {
    public static void main(String[] args) {
        // Example 1
        int number = 10;

        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // execute this block
        // if number is not greater than 0
        else {
            System.out.println("The number is not positive.");
        }

        System.out.println("Statement outside if...else block");

        // Example 2
        boolean isCold = true;

        if (isCold) {
            System.out.println("Wear a jacket.");
        } else {
            System.out.println("Wear a t-shirt.");
        }
        System.out.println("Statement outside if...else block");

    }
}
