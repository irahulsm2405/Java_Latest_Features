package Java_16;

/*
New method to collect elements of a stream into an unmodifiable list in a concise way.
This replaces the more verbose .collect(Collectors.toList()) when an unmodifiable list is acceptable.
 */

import java.util.List;
import java.util.stream.Stream;

public class StreamToListMethod {
    public static void main(String[] args) {

        List<String> list = Stream.of("a", "b", "c").toList();
        System.out.println(list);  // [a, b, c]

        // list.add("d"); // Throws UnsupportedOperationException

    }
}
