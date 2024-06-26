import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Select operation
        System.out.println("Select operation: 1) Add 2) Subtract 3) Multiply 4) Divide");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        double result = 0;

        // Perform operation
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        // Output result
        System.out.println("Result: " + result);

        scanner.close();
    }
}
