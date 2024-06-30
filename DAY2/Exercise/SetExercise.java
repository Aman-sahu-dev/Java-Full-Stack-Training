import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Add elements to the set
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("date");
        set.add("elderberry");

        // Print the set
        System.out.println("Set: " + set);

        // Check if the set contains "banana"
        boolean containsBanana = set.contains("banana");
        System.out.println("Contains 'banana': " + containsBanana);

        // Remove "date" from the set
        set.remove("date");

        // Print the set again
        System.out.println("Modified Set: " + set);

        // Add "fig" and "grape" to the set
        set.add("fig");
        set.add("grape");

        // Print the set
        System.out.println("Final Set: " + set);
    }
}
