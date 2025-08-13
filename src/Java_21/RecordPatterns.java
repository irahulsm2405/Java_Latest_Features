package Java_21;

/*
Record Patterns let you destructure a record directly into its components when doing pattern matching in 
if statements, switch expressions, and instanceof.
You can also nest patterns, so if a record contains another record, you can unpack both in one go.
 */

public class RecordPatterns {

	record Point(int x, int y) {
	}

	record Rectangle(Point topLeft, Point bottomRight) {
	}

	static String describe(Object o) {
		return switch (o) {
		case Point(int x, int y) when x == y -> "Diagonal point";
		case Point(int x, int y) -> "Point (" + x + "," + y + ")";
		default -> "Unknown";
		};
	}

	public static void main(String[] args) {

		// Simple Restructuring
		Object obj = new Point(10, 20);
		if (obj instanceof Point(int x, int y)) {
			System.out.println("x=" + x + ", y=" + y);
		}

		// In switch case
		System.out.println(describe(new Point(5, 5)));
		System.out.println(describe(new Point(3, 7)));

		// Nested Patterns
		Object obj2 = new Rectangle(new Point(0, 0), new Point(10, 10));

		if (obj2 instanceof Rectangle(Point(int x1, int y1), Point(int x2, int y2))) {
			System.out.printf("Top-left=(%d,%d), Bottom-right=(%d,%d)%n", x1, y1, x2, y2);
		}
	}
}
