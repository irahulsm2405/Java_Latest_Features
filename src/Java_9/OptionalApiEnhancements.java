package Java_9;

/*
 Optional API Enhancements in Java 9
 Java 9 made it more powerful by adding 3 new methods
 */

import java.util.Optional;

public class OptionalApiEnhancements {
    public static void main(String[] args) {
        /*
        ifPresentOrElse(Consumer, Runnable)
        Executes the first argument if value is present, otherwise executes the second.
         */
        Optional<String> opt = Optional.of("Hello");
        opt.ifPresentOrElse(
                val -> System.out.println("Value: " + val),
                () -> System.out.println("Value is absent")
        );
        // Output: Value: Hello

        Optional<String> emptyOpt = Optional.empty();
        emptyOpt.ifPresentOrElse(
                val -> System.out.println("Value: " + val),
                () -> System.out.println("Value is absent")
        );
        // Output: Value is absent

        /*
        or(Supplier<Optional<T>>)
        Returns the current Optional if value is present; otherwise returns another Optional from the supplier.
         */
        Optional<String> opt2 = Optional.empty();
        String result = opt2.or(() -> Optional.of("Default"))
                .get();
        System.out.println(result); // Default

        /*
        stream()
        Converts the Optional into a Stream:
        0 elements if empty.
        1 element if value present.
         */
        Optional<String> opt3 = Optional.of("Hi");
        opt3.stream().forEach(System.out::println); // Output: Hi

        Optional<String> emptyOpt1 = Optional.empty();
        emptyOpt1.stream().forEach(System.out::println); // No output

    }
}
