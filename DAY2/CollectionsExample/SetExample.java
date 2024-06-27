package DAY2.CollectionsExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // HashSet Example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("HashSet Element 1");
        hashSet.add("HashSet Element 2");
        hashSet.add("HashSet Element 1"); // Duplicate element
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet Example
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("LinkedHashSet Element 1");
        linkedHashSet.add("LinkedHashSet Element 2");
        linkedHashSet.add("LinkedHashSet Element 1"); // Duplicate element
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet Example
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("TreeSet Element 2");
        treeSet.add("TreeSet Element 1");
        treeSet.add("TreeSet Element 1"); // Duplicate element
        System.out.println("TreeSet: " + treeSet);
    }
}
