package DAY2.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Apple");

        // Using Stream to filter and collect elements
        List<String> filteredList = list.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .collect(Collectors.toList());
                /*Note...
                1. Collectors.toList() is a method in the java.util.stream.Collectors class.
                It is used to collect the elements of a stream into a List.
                2. Lambda expressions are commonly used with the Stream API to define the behavior of
                stream operations such as filter, map, forEach, etc.

                more on ... "https://www.geeksforgeeks.org/stream-in-java/"
                */

        System.out.println("Filtered List: " + filteredList);

        // Using Stream to find distinct elements and print them
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
