import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal, rate, and time
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output result
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}
