package DAY2.CollectionsExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their corresponding scores
        Map<String, Integer> studentScores = new HashMap<>();

        // Add key-value pairs to the HashMap
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 90);

        // Retrieve and print the score of a specific student
        String student = "Bob";
        Integer score = studentScores.get(student);
        System.out.println(student + "'s score: " + score); // Output: Bob's score: 92

        // Check if a specific student is in the map
        String newStudent = "Eve";
        if (studentScores.containsKey(newStudent)) {
            System.out.println(newStudent + " is in the map.");
        } else {
            System.out.println(newStudent + " is not in the map."); // Output: Eve is not in the map.
        }

        // Remove a student from the map
        studentScores.remove("Charlie");

        // Iterate over the entries in the HashMap and print them
        System.out.println("Student scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
