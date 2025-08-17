package Java_11;

import java.util.List;

public class VarInLambdaParameters {
    public static void main(String[] args) {

        /*
        Java 10 introduced var for local variables,
        Java 11 lets you use it in lambda parameters, mainly for annotations or readability.
         */
        List<String> names = List.of("Alice", "Bob", "Charlie");

        // Before Java 11
        names.forEach((String name) -> {
            System.out.println(name.toUpperCase());
        });

        // After java 11
        names.forEach((var name) -> {
            System.out.println(name.toUpperCase());
        });
    }
}
