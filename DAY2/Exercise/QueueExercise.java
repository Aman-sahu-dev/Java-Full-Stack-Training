import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Print the queue
        System.out.println("Queue: " + queue);

        // Remove and print the head of the queue
        int head = queue.remove();
        System.out.println("Removed head: " + head);

        // Print the queue again
        System.out.println("Queue after removal: " + queue);

        // Peek at the head of the queue
        int peekHead = queue.peek();
        System.out.println("Peek head: " + peekHead);

        // Print the queue
        System.out.println("Queue after peek: " + queue);
    }
}
