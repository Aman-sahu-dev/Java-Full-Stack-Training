package DAY2.CollectionsExample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.ArrayDeque;

public class QueueExample {
    public static void main(String[] args) {
        // LinkedList as a Queue
        Queue<String> linkedListQueue = new LinkedList<>();
        linkedListQueue.add("LinkedList Element 1");
        linkedListQueue.offer("LinkedList Element 2");
        System.out.println("LinkedList Queue: " + linkedListQueue);
        System.out.println("Removed: " + linkedListQueue.poll());
        System.out.println("LinkedList Queue after poll: " + linkedListQueue);

        // PriorityQueue
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("PriorityQueue Element 1");
        priorityQueue.offer("PriorityQueue Element 2");
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Removed: " + priorityQueue.poll());
        System.out.println("PriorityQueue after poll: " + priorityQueue);

        // ArrayDeque as a Queue
        Queue<String> arrayDequeQueue = new ArrayDeque<>();
        arrayDequeQueue.add("ArrayDeque Element 1");
        arrayDequeQueue.offer("ArrayDeque Element 2");
        System.out.println("ArrayDeque Queue: " + arrayDequeQueue);
        System.out.println("Removed: " + arrayDequeQueue.poll());
        System.out.println("ArrayDeque Queue after poll: " + arrayDequeQueue);
    }
}

