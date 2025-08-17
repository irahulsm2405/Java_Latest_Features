package Java_8;

import java.util.function.*;

public class InbuildFunctionalInterfaces {
    public static void main(String[] args) {

        // Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4)); // true

        // Bi-Predicate
        BiPredicate<String, String> areEqual = (a, b) -> a.equals(b);
        System.out.println(areEqual.test("hello", "hello")); // true

        // Function
        Function<String, Integer> length = str -> str.length();
        System.out.println(length.apply("Java")); // 4

        // Bi-Function
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 3)); // 8

        // Supplier
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get()); // 0.234567...

        // Consumer
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Hello World"); // Hello World

        // BiConsumer
        BiConsumer<String, Integer> printNameAge = (name, age) ->
                System.out.println(name + " is " + age + " years old");
        printNameAge.accept("Rahul", 25);

    }
}
