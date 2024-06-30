import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Add entries to the map
        map.put("Alice", 85);
        map.put("Bob", 92);
        map.put("Charlie", 78);
        map.put("Diana", 90);

        // Print the map
        System.out.println("Map: " + map);

        // Get and print the score of "Bob"
        int scoreBob = map.get("Bob");
        System.out.println("Score of Bob: " + scoreBob);

        // Update the score of "Charlie" to 80
        map.put("Charlie", 80);

        // Remove "Alice" from the map
        map.remove("Alice");

        // Print the map again
        System.out.println("Modified Map: " + map);

        // Check if "Diana" is in the map
        boolean containsDiana = map.containsKey("Diana");
        System.out.println("Contains 'Diana': " + containsDiana);
    }
}
