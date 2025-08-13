package Java_11;

    /*
    Java 11’s Optional.isEmpty() feature
    Adds a clearer way to check if an Optional has no value.
    */

import java.util.Optional;

public class IsEmpty {
    public static void main(String[] args) {

        Optional<String> name = Optional.empty();

        // Old way
        if (!name.isPresent()) {
            System.out.println("No name present");
        }

        // New way
        if (name.isEmpty()) {
            System.out.println("No name present");
        }
    }
}
