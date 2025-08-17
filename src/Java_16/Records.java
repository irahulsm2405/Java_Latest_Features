package Java_16;

    /*
    Records (Standard)
    Concise syntax for immutable data carriers.
    Automatically generates equals(), hashCode(), toString(), and getters.
    Great for DTOs, value objects, and simple data containers.
     */

/*
Records provide a compact syntax to declare classes that are simple data carriers
basically immutable data classes without boilerplate code for getters, constructors, equals, hashCode, toString.
 */


import java.util.Objects;


//Before java 14
class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return age == p.age && name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}
//Java 14
// Check the newly created class called Person1


// Fully released in Java 16. Use Java 16+ running this
public class Records {
    public static void main(String[] args) {
        //Before java 14
        Person p = new Person("Rahul", 30);
        System.out.println(p);

        //After Java 14
        Person1 p1 = new Person1("Rahul", 25);
        System.out.println(p);
}
}
