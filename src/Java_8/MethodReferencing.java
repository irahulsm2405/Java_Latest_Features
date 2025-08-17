package Java_8;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferencing {
    public static void main(String[] args) {

        // Static Method Reference
        Function<String, Integer> parserMethodRef = Integer::parseInt;
        System.out.println(parserMethodRef.apply("456"));  // 456

        // Instance Method Reference of a Particular Object
        PrintStream ps = System.out;

        Consumer<String> printerLambda = s -> ps.println(s);
        Consumer<String> printerMethodRef = ps::println;

        printerLambda.accept("Hello Lambda");
        printerMethodRef.accept("Hello Method Reference");

        // Instance Method Reference of an Arbitrary Object of a Particular Type
        List<String> names = Arrays.asList("Mark", "John", "Anna");
        // Lambda:
        names.forEach(name -> System.out.println(name));
        // Method Reference:
        names.forEach(System.out::println);

        // Constructor Reference
        Supplier<List<String>> listSupplierLambda = () -> new ArrayList<>();
        Supplier<List<String>> listSupplierMethodRef = ArrayList::new;

        List<String> list1 = listSupplierLambda.get();
        List<String> list2 = listSupplierMethodRef.get();

        System.out.println(list1);  // []
        System.out.println(list2);  // []

        // Using Method Reference with Custom Class
        List<Person> people = Arrays.asList(new Person("John"), new Person("Jane"));
        // Lambda:
        people.stream()
                .map(person -> person.getName())
                .forEach(System.out::println);
        // Method reference:
        people.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        // Using Method Reference for Comparator
        List<String> names1 = Arrays.asList("Mark", "John", "Anna");
        // Lambda:
        Collections.sort(names1, (a, b) -> a.compareToIgnoreCase(b));
        // Method Reference:
        Collections.sort(names1, String::compareToIgnoreCase);

        System.out.println(names1); // [Anna, John, Mark]

        // Method Reference for Instance Method with Two Parameters
        BiPredicate<String, String> equalsLambda = (a, b) -> a.equals(b);
        BiPredicate<String, String> equalsMethodRef = String::equals;

        System.out.println(equalsLambda.test("abc", "abc"));   // true
        System.out.println(equalsMethodRef.test("abc", "xyz")); // false

    }
}

// Using Method Reference with Custom Class
class Person {
    private String name;
    Person(String name) { this.name = name; }
    public String getName() { return name; }
}
