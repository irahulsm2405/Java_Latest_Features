package Java_21;

	/*
	Sequenced Collections is Pattern Matching for switch
	This feature upgrades the switch statement (and expression) so it can match patterns, not just constant values.
	
	It works with:
	Type patterns (like instanceof)
	Record patterns (destructure records in switch)
	Null values (switch can now handle null directly)
	Guarded patterns (when clauses for extra conditions)
	 */

public class PatternMatchingForSwitch {

	// Type patterns
	static String formatter(Object obj) {
		return switch (obj) {
		case Integer i -> "int: " + i;
		case String s -> "string: " + s;
		case null -> "null";
		default -> "unknown";
		};
	}

	// Guarded Patterns
	static String sizeCheck(Object obj) {
		return switch (obj) {
		case String s when s.length() > 5 -> "Long string";
		case String s -> "Short string";
		default -> "Not a string";
		};
	}
	
	// Record Patterns in switch
	record Point(int x, int y) {}

	static String describe(Object o) {
	    return switch (o) {
	        case Point(int x, int y) when x == y -> "Diagonal point";
	        case Point(int x, int y)             -> "Point at (" + x + "," + y + ")";
	        default                              -> "Not a point";
	    };
	}

	public static void main(String[] args) {
        Object[] items = {42, "Hello", null, 3.14};

        for (Object obj : items) {
            System.out.println(formatter(obj));
	}
	}

}
