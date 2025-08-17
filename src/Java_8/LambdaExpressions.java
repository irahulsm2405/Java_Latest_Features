package Java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaExpressions {
    public static void main(String[] args) {

        //No Parameters, No Return Value
        Runnable r1 = () -> System.out.println("Hello from lambda!");
        r1.run();

        //Single Parameter, No Return Value
        Consumer<String> printer = (s) -> System.out.println(s);
        printer.accept("Hello world!");

        //Multiple Parameters, Return Value
        Comparator<Integer> comparator1 = (a, b) -> a.compareTo(b);
        int result = comparator1.compare(15, 11);
        System.out.println(result); // Output: negative number because 5 < 10

        //Multiple Statements in Lambda Body
        Comparator<Integer> comparator2 = (a, b) -> {
            System.out.println("Comparing " + a + " and " + b);
            return a.compareTo(b);
        };
        System.out.println(comparator2.compare(5, 10));

        //Using Lambda with Collections
        List<String> names = Arrays.asList("Mark", "John", "Anna");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names); // [Anna, John, Mark]

        //With streams
        names.stream().filter(name -> name.startsWith("J")).forEach(System.out::println);

        //Capturing Variables (Effectively Final)
        int factor = 2;
        Function<Integer, Integer> multiplier = (x) -> x * factor;
        System.out.println(multiplier.apply(5));  // Output: 10

        //With functional Interfaces
        FunctionalInterface add = (a, b) -> a + b;
        System.out.println(add.operate(25,25));

        //Returning Objects
        Supplier<String> helloSupplier = () -> "Hello, Supplier!";
        System.out.println(helloSupplier.get());

        //Using Lambda with Streams (Map, Filter, Reduce)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)    // filter even numbers
                .map(n -> n * n)            // square each
                .reduce(0, Integer::sum);   // sum them up

        System.out.println(sum);  // Output: 20 (4 + 16)

        //Lambda with Multiple Statements Returning Value
        Function<Integer, Integer> factorial = n -> {
            int result1 = 1;
            for (int i = 1; i <= n; i++) result1 *= i;
            return result1;
        };

        System.out.println(factorial.apply(5));
    }
}
