package Java_11;

public class StringMethods {
    public static void main(String[] args) {
        /*
        isBlank()
        Checks if the string is empty or contains only whitespace (including Unicode spaces).
        No need to write str.trim().isEmpty() anymore.
         */
        System.out.println("".isBlank());        // true
        System.out.println("   ".isBlank());     // true
        System.out.println("\n\t".isBlank());    // true
        System.out.println("abc".isBlank());     // false

        /*
        strip() / stripLeading() / stripTrailing()
        Like trim() but Unicode-aware and more flexible.
        Unlike trim(), it works correctly for all Unicode whitespace characters.
         */
        String text = "   hello   ";

        System.out.println(text.strip());         // "hello"
        System.out.println(text.stripLeading());  // "hello   "
        System.out.println(text.stripTrailing()); // "   hello"

        /*
        lines()
        Splits a string into a Stream of lines, useful for processing multi-line text.
         */
        String multiLine = "Java\nPython\nC++";
        multiLine.lines().forEach(System.out::println);

        /*
        repeat(int count)
        Repeats the string multiple times.
         */
        System.out.println("abc".repeat(3)); // abcabcabc
    }
}
