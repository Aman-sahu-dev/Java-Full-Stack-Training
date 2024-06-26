import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks for subject 1: ");
        int marks1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int marks2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int marks3 = scanner.nextInt();

        // Calculate average
        double average = (marks1 + marks2 + marks3) / 3.0;
        System.out.println("Average marks: " + average);

        // Determine grade
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output grade
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
