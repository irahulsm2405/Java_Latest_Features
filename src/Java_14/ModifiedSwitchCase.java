package Java_14;

    /*
    Switch Expressions (Standardized)
    Switch can now return values, and use arrow syntax for clearer code.
     */

public class ModifiedSwitchCase {
    public static void main(String[] args) {

        // Before Java 14
        String day = "MONDAY";
        int num = 0;
        switch(day) {
            case "MONDAY": num = 1; break;
            case "TUESDAY": num = 2; break;
            default: num = 0;
        }

        // Java 14 switch expression
        int num1 = switch(day) {
            case "MONDAY" -> 1;
            case "TUESDAY" -> 2;
            default -> 0;
        };
        System.out.println(num1);

    }

}
