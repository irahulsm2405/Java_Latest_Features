package Java_9;

// Java 9 added three big enhancements to stream api

import java.util.stream.Stream;

public class StreamsApiEnhancements {
    public static void main(String[] args) {

        /* 1.
        takeWhile(Predicate)
        Takes elements while the condition is true.
        Stops as soon as the predicate becomes false (short-circuits)
         */
        Stream<Integer> s = Stream.of(1, 2, 3, 4, 2, 1);
        s.takeWhile(n -> n < 4)
                .forEach(System.out::println);


        /* 2.
        dropWhile(Predicate)
        Opposite of takeWhile().
        Drops elements while the condition is true, then takes the rest.
         */
        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 2, 1);
        s1.dropWhile(n -> n < 4)
                .forEach(System.out::println);


        /* 3.
        New iterate() Overload
        Java 8’s Stream.iterate(seed, next) could create infinite streams; you had to manually limit them.
        Java 9 added a three-argument version: iterate(seed, hasNextPredicate, nextFunction)
         */
        Stream.iterate(1, n -> n <= 5, n -> n + 1)
                .forEach(System.out::println);

        /*
        Stream.ofNullable()
        Creates a stream with 0 or 1 element depending on if the value is null.
        Useful to avoid NullPointerException
         */
        Stream.ofNullable(null).forEach(System.out::println); // No output
        Stream.ofNullable("Hi").forEach(System.out::println); // Prints "Hi"
    }
}
