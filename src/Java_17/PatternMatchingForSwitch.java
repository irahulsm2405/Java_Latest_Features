package Java_17;

/*
Pattern Matching for switch (final)
Purpose: Simplifies complex switch statements by allowing pattern matching inside switch.
Use case: Cleaner and more readable code when you switch on types or values.
Benefit: Reduces boilerplate and makes type checking with switches easier and less error-prone.
 */

public class PatternMatchingForSwitch {
	public static void main(String[] args) {
		
		Object obj1 = "Hello, Java 17!";
        Object obj2 = 12345;
        Object obj3 = 45.67;
        Object obj4 = true;

        System.out.println(describeObject(obj1));  // String case
        System.out.println(describeObject(obj2));  // Integer case
        System.out.println(describeObject(obj3));  // Double case
        System.out.println(describeObject(obj4));  // Default case
    }

    public static String describeObject(Object obj) {
        // Using pattern matching with switch (Java 17)
        return switch (obj) {
            case String s -> "It's a string of length " + s.length();
            case Integer i -> "It's an integer with value " + i;
            case Double d -> "It's a double with value " + d;
            default -> "Unknown type: " + obj;
        };
	}
}
