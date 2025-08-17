package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        // Creating Optional Objects
        Optional<String> optional1 = Optional.of("Hello");      // Value must be non-null
        Optional<String> optional2 = Optional.ofNullable(null);  // Nullable value
        Optional<String> optional3 = Optional.empty();           // Empty optional

        // Checking Presence of Value
        Optional<String> optional = Optional.of("Java");
        if (optional.isPresent()) {
            System.out.println("Value is present: " + optional.get());
        } else {
            System.out.println("No value");
        }

        // Using ifPresent() to Execute Code if Value is Present
        optional.ifPresent(value -> System.out.println("Value: " + value));

        // Provide Default Value with orElse()
        String result = optional2.orElse("Default Value");
        System.out.println(result);  // Prints "Default Value" because optional2 is empty

        // Provide Default Value with orElseGet() (Lazy Supplier)
        String result1 = optional2.orElseGet(() -> "Computed Default");
        System.out.println(result1);

        // Throw Exception if No Value with orElseThrow()
        //String value = optional2.orElseThrow(() -> new IllegalArgumentException("Value not present"));

        // Transform Value with map()
        Optional<String> optionalName = Optional.of("john");
        Optional<String> upperName = optionalName.map(String::toUpperCase);
        upperName.ifPresent(System.out::println); // JOHN

        // FlatMap with Optional of Optional
        Optional<String> name = Optional.of("John");
        Optional<Integer> length = name.flatMap(n -> Optional.of(n.length()));
        length.ifPresent(System.out::println); // 4

        // Filter Optional Value
        Optional<String> optionalName1 = Optional.of("John");

        optionalName1.filter(name1 -> name1.startsWith("J")).ifPresent(name1 -> System.out.println("Name starts with J: " + name1));

        // If filter fails, it returns empty Optional
        optionalName1.filter(name1 -> name1.startsWith("X")).ifPresent(name1 -> System.out.println("Won't print"));

        // Chaining Optionals
        Optional<String> optional4 = Optional.of("Java");

        optional4.map(String::toUpperCase).filter(s -> s.startsWith("J")).ifPresent(System.out::println); // JAVA

        // Optional with Collections
        List<String> list = Arrays.asList("A", "B", "C");

        Optional<List<String>> optionalList = Optional.of(list);

        optionalList.ifPresent(l -> l.forEach(System.out::println));

        // Common Pitfall — Avoid get() Without Check
        Optional<String> emptyOpt = Optional.empty();

        // risky! Throws NoSuchElementException if empty
        // String val = emptyOpt.get();

        // safer way:
        String val = emptyOpt.orElse("default");
        System.out.println(val);  // default
    }
}
