package Java_8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApi {
    public static void main(String[] args) {

        // Create Stream from Collection
        List<String> names = Arrays.asList("John", "Jane", "Mark");
        Stream<String> stream = names.stream();

        // Filter Elements
        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println(filtered);

        // Map (Transform) Elements
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperNames); // [JOHN, JANE, MARK]

        // Sorted Stream
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNames); // [Jane, John, Mark]

        // Sort reverse order
        List<String> reverseSorted = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(reverseSorted); // [Mark, John, Jane]

        // Distinct Elements
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctNumbers); // [1, 2, 3, 4]

        // Limit and Skip
        List<String> limited = names.stream()
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(limited); // [John, Jane]

        List<String> skipped = names.stream()
                .skip(1)
                .collect(Collectors.toList());

        System.out.println(skipped); // [Jane, Mark]

        // forEach
        names.stream().forEach(name -> System.out.println("Hello " + name));

        // Collect Results
        Set<String> nameSet = names.stream()
                .collect(Collectors.toSet());

        String joined = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(joined); // John, Jane, Mark

        // Reduce (Aggregate Values)
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);

        // Sum all numbers
        int sum = numbers1.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum); // 15

        // Find max
        Optional<Integer> max = numbers1.stream()
                .reduce(Integer::max);

        max.ifPresent(System.out::println); // 5

        // Match Operations
        boolean anyStartsWithJ = names.stream()
                .anyMatch(name -> name.startsWith("J"));

        boolean allStartsWithJ = names.stream()
                .allMatch(name -> name.startsWith("J"));

        boolean noneStartsWithZ = names.stream()
                .noneMatch(name -> name.startsWith("Z"));

        System.out.println(anyStartsWithJ);  // true
        System.out.println(allStartsWithJ);  // false
        System.out.println(noneStartsWithZ); // true

        // Find First / Find Any
        Optional<String> first = names.stream()
                .findFirst();

        first.ifPresent(System.out::println);  // John

        Optional<String> any = names.parallelStream()
                .findAny();

        any.ifPresent(System.out::println);    // Could be any element

    }
}
