package Java_9;

import java.util.*;

public class FactoryMethodsForImmutableCollections {
    public static void main(String[] args) {
        /*
         * Before Java 9, creating small fixed collections was verbose:
         * Now you can create immutable lists, sets, and maps directly.
         * No extra Collections.unmodifiableList() needed.
         * Much shorter and cleaner.
         */

        //old way
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1 = Collections.unmodifiableList(list1);

        //Java 9 way
        List<String> list = List.of("A", "B", "C");
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "One", 2, "Two", 3, "Three");

    }
}
