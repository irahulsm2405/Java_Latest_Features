package Java_9;

/*
    Before Java 9, You could only use @SafeVarargs on:
    final methods
    static methods
    constructors
    Private methods were not allowed to use it, even though they can’t be overridden (which means varargs safety can’t be broken).

    Now private methods can also use @SafeVarargs.
    Reason: Private methods, like static/final methods, cannot be overridden, so there’s no type safety risk.

    Why @SafeVarargs Exists
    Varargs with generics (List<String>...) can produce heap pollution warnings.
    @SafeVarargs tells the compiler: "Trust me, I’m handling this safely, don’t warn me."
 */

import java.util.List;

public class SafeVarargsOnPrivateMethods {
    public static void main(String[] args) {
        SafeVarargsOnPrivateMethods t = new SafeVarargsOnPrivateMethods();
        t.showLists(List.of("A", "B"), List.of("C", "D"));
    }

    @SafeVarargs
    private final <T> void showLists(List<T>... lists) {
        for (List<T> list : lists) {
            System.out.println(list);
        }
    }
}

