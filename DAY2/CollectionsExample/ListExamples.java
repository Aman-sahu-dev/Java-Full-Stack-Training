package DAY2.CollectionsExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;

public class ListExamples {
    public static void main(String[] args) {
        // ArrayList Example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ArrayList Element 1");
        arrayList.add("ArrayList Element 2");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList Example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("LinkedList Element 1");
        linkedList.add("LinkedList Element 2");
        System.out.println("LinkedList: " + linkedList);

        // Vector Example
        Vector<String> vector = new Vector<>();
        vector.add("Vector Element 1");
        vector.add("Vector Element 2");
        System.out.println("Vector: " + vector);

        // Stack Example
        Stack<String> stack = new Stack<>();
        stack.push("Stack Element 1");
        stack.push("Stack Element 2");
        System.out.println("Stack: " + stack);

        // Demonstrating common List operations
        arrayList.add(1, "ArrayList Element 1.5"); // Adding at index
        linkedList.remove(0);                     // Removing element at index
        vector.set(1, "Vector Element 2 (Updated)"); // Updating element
        String stackTop = stack.pop();            // Removing top element from stack

        // Printing updated lists
        System.out.println("Updated ArrayList: " + arrayList);
        System.out.println("Updated LinkedList: " + linkedList);
        System.out.println("Updated Vector: " + vector);
        System.out.println("Top Element removed from Stack: " + stackTop);
        System.out.println("Updated Stack: " + stack);
    }
}
