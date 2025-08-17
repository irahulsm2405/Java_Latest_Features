package Java_16;

    /*
    Set.of() and Map.of() improvements
    The Set.of() and Map.of() factory methods now accept zero or more elements and throw exceptions on duplicates at runtime.
    Useful for concise, immutable collections.
     */

import java.util.Map;
import java.util.Set;

public class SetOfAndMapOfImprovements {
    public static void main(String[] args) {
        Set<String> set = Set.of("A", "B", "C");
        Map<Integer, String> map = Map.of(1, "one", 2, "two");
    }
}
