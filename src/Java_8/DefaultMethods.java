package Java_8;

public class DefaultMethods {
    public static void main(String[] args) {

        //Implementation 1
        System.out.println("Implementation 1");
        MyClass obj = new MyClass();
        obj.hello();

        //Implementation 2
        System.out.println("Implementation 2");
        Animal a = new Dog();
        a.sound();  // Output: Bark

        //Implementation 3
        System.out.println("Implementation 3");
        MyClass1 obj1 = new MyClass1();
        obj.hello();

        //Implementation 4
        System.out.println("Implementation 4");
        ConsolePrinter printer = new ConsolePrinter();
        printer.printTwice("Hello");

        //Implementation 5
        System.out.println("Implementation 5");
        MyCalculator calc = new MyCalculator();
        System.out.println(calc.add(5, 3));      // 8
        System.out.println(Calculator.multiply(5, 3)); // 15

        //Implementation 6
        System.out.println("Implementation 6");
        C obj3 = new C();
        obj3.greet(); // Output: Hello from B
    }
}

// Basic Default Method
// Implementation 1 start
interface InterfaceA {
    default void hello() {
        System.out.println("Hello from InterfaceA");
    }
}

interface InterfaceB {
    default void hello() {
        System.out.println("Hello from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void hello() {
        // Must explicitly choose which default to use or provide own implementation
        InterfaceA.super.hello();  // calling InterfaceA's default method
        InterfaceB.super.hello();  // calling InterfaceB's default method
        System.out.println("Hello from MyClass");
    }
}
// Implementation 1 end

// Overriding Default Method in Implementing Class
// Implementation 2 start
interface Animal {
    default void sound() {
        System.out.println("Some generic sound");
    }
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}
// Implementation 2 end

// Multiple Inheritance Conflict — Diamond Problem
// Implementation 3 start
interface InterfaceC {
    default void hello() {
        System.out.println("Hello from InterfaceA");
    }
}

interface InterfaceD {
    default void hello() {
        System.out.println("Hello from InterfaceB");
    }
}

class MyClass1 implements InterfaceA, InterfaceB {
    @Override
    public void hello() {
        // Must explicitly choose which default to use or provide own implementation
        InterfaceA.super.hello();  // calling InterfaceA's default method
        InterfaceB.super.hello();  // calling InterfaceB's default method
        System.out.println("Hello from MyClass");
    }
}
// Implementation 3 end

// Default Method Calling Another Default or Abstract Method
// Implementation 4 start
interface Printer {
    void print(String message); // abstract method

    default void printTwice(String message) {
        print(message);
        print(message);
    }
}

class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
// Implementation 4 end

//  Using Static Methods in Interface Along with Default Methods
// Implementation 5 start
interface Calculator {
    default int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

class MyCalculator implements Calculator {}
// Implementation 5 end

// Extending Interface and Overriding Default Method
// Implementation 6 start
interface A {
    default void greet() {
        System.out.println("Hello from A");
    }
}

interface B extends A {
    @Override
    default void greet() {
        System.out.println("Hello from B");
    }
}

class C implements B {}
// Implementation 6 end