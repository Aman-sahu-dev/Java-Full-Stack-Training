public class If_ElseIf_else {
    public static void main(String[] args) {
        // Example 1
        int number = 0;
        // checks if number is greater than 0
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        // checks if number is less than 0
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
        // if both condition is false
        else {
            System.out.println("The number is 0.");
        }

        // Example 2
        boolean hasCar = false;
        boolean hasBike = true;

        if (hasCar) {
            System.out.println("Drive a car.");
        } else if (hasBike) {
            System.out.println("Ride a bike.");
        } else {
            System.out.println("Walk.");
        }
        System.out.println("Statement outside if..else-if...else block");
    }
}
