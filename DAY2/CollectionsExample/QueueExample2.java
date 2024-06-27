package DAY2.CollectionsExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample2 {
    public static void main(String[] args) {
        // Create a Queue using LinkedList as the implementation
        Queue<String> queue = new LinkedList<>();

        // Add elements to the Queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Print the Queue
        System.out.println("Queue: " + queue); // Output: Queue: [Alice, Bob, Charlie]

        // Remove and retrieve the head of the Queue
        String head = queue.remove();
        System.out.println("Removed from Queue: " + head); // Output: Removed from Queue: Alice

        // Peek at the head of the Queue (retrieve without removing)
        String peeked = queue.peek();
        System.out.println("Head of Queue: " + peeked); // Output: Head of Queue: Bob

        // Print the Queue after removal and peek
        System.out.println("Queue after operations: " + queue); // Output: Queue after operations: [Bob, Charlie]
    }
}
