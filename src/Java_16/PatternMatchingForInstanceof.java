package Java_16;

    /*
    Simplifies the code when using instanceof by introducing a pattern variable.
     */

public class PatternMatchingForInstanceof {
    public static void main(String[] args) {

        Object obj = "Hello world";

        //Before Java 16
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.toLowerCase());
        }

        //After Java 16
        if (obj instanceof String s) {
            System.out.println(s.toLowerCase());
        }

    }
}
