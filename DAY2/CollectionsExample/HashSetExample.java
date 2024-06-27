package DAY2.CollectionsExample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store unique integers
        Set<Integer> numbers = new HashSet<>();

        // Add elements to the HashSet
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // Duplicate element, will not be added

        // Print the HashSet
        System.out.println("HashSet: " + numbers); // Output: HashSet: [1, 2, 3]

        // Check if an element exists in the HashSet
        if (numbers.contains(2)) {
            System.out.println("HashSet contains 2");
        } else {
            System.out.println("HashSet does not contain 2");
        }

        // Remove an element from the HashSet
        numbers.remove(3);

        // Print the HashSet after removal
        System.out.println("HashSet after removal: " + numbers); // Output: HashSet after removal: [1, 2]
    }
}
