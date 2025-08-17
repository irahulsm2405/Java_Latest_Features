package Java_17;

/*
Sealed Classes (finalized in Java 17)
Purpose: To restrict which classes or interfaces can extend or implement a class/interface.
Use case: Provides more control over inheritance hierarchy, useful for domain modeling, better code safety, and maintainability.
Benefit: Helps when you want a closed set of subclasses, enabling better exhaustiveness checks and safer designs.
 */

//Check Vehicle, Truck and Car classes for implementation


// This will throw error as this class is not permitted to extend Vehicle
// public class SealedClasses extends Vehicle{} 

public class SealedClasses {

}
