package DAY2.CollectionsExample;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create a List using ArrayList as the implementation
        List<String> list = new ArrayList<>();

        // Add elements to the List
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        // Print the List
        System.out.println("List: " + list);  // Output: List: [Alice, Bob, Charlie]

        // Get element at index 1
        String secondElement = list.get(1);
        System.out.println("Element at index 1: " + secondElement);  // Output: Element at index 1: Bob

        // Remove element at index 2
        String removedElement = list.remove(2);
        System.out.println("Removed element: " + removedElement);  // Output: Removed element: Charlie

        // Set element at index 0 to a new value
        list.set(0, "Alicia");

        // Print the List after modifications
        System.out.println("Modified List: " + list);  // Output: Modified List: [Alicia, Bob]

        // Find the index of an element
        int index = list.indexOf("Bob");
        System.out.println("Index of 'Bob': " + index);  // Output: Index of 'Bob': 1

        // Get the size of the List
        int size = list.size();
        System.out.println("Size of the List: " + size);  // Output: Size of the List: 2
    }
}

