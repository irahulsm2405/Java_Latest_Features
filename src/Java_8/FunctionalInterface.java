package Java_8;

// Functional interface is an interface with only method. Below is an example
// Other inbuilt functional interfaces are Consumer, Supplier, Predicate, Function
// It's used with lambda expressions
// Please check for implementation of this method in LambdaExpressions class

@java.lang.FunctionalInterface
interface FunctionalInterface {
    int operate(int a, int b);
}
