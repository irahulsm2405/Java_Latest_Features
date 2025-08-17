package Java_17;

public sealed class Vehicle permits Car, Truck {
	public static void main(String[] args) {
		System.out.println("This Vehicle class");
	}
}
