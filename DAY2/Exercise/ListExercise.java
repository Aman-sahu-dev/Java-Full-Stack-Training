import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Add numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        // Print the list
        System.out.println("List: " + list);

        // Remove element at index 5
        list.remove(5);

        // Set element at index 3 to 100
        list.set(3, 100);

        // Print the list again
        System.out.println("Modified List: " + list);

        // Find the index of element 100
        int index = list.indexOf(100);
        System.out.println("Index of 100: " + index);

        // Print the size of the list
        int size = list.size();
        System.out.println("Size of the List: " + size);
    }
}
