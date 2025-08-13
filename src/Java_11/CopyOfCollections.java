package Java_11;

/* Java 11’s copyOf() for collections.
    Creates an immutable copy of an existing collection.
    Works for List, Set, and Map.
    Added in Java 10 for lists, but Java 11 made it consistently available across collections.
 */

import java.util.*;

public class CopyOfCollections {
    public static void main(String[] args) {

        // For List
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        // Create an immutable copy
        List<String> copy = List.copyOf(names);

        System.out.println(copy); // [Alice, Bob]

        // Trying to modify throws UnsupportedOperationException
        // copy.add("Charlie"); // ❌ Runtime error

        // For set
        Set<String> cities = new HashSet<>(Set.of("Paris", "London", "Tokyo"));
        Set<String> citiesCopy = Set.copyOf(cities);

        // For map
        Map<String, Integer> scores = Map.of("Alice", 90, "Bob", 80);
        Map<String, Integer> scoresCopy = Map.copyOf(scores);

    }
}
