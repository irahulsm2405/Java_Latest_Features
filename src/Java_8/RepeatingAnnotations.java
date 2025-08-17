package Java_8;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Authors.class) // container annotation
@interface Author {
    String name();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Authors {
    Author[] value();
}

// Usage of repeated annotations
@Author(name = "Alice")
@Author(name = "Bob")
class Book {
}

class RepeatingAnnotations {
    public static void main(String[] args) {
        Author[] authors = Book.class.getAnnotationsByType(Author.class);
        for (Author author : authors) {
            System.out.println(author.name());
        }
    }
}

