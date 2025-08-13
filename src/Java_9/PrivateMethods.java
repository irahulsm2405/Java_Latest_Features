package Java_9;

/*
 * Before Java 9:
 * Interfaces could have default and static methods (since Java 8) to add new behavior without breaking implementations.
 * But… if you wanted to reuse code inside multiple default or static methods,
 * you had to duplicate it because interfaces couldn’t have private helper methods.
 * Java 9 fixed this by allowing private and private static methods in interfaces, which are NOT inherited by implementing classes.
 */

// A
/* Private Instance Methods
 * Used for code reuse between default methods.
 * Accessible only inside the same interface.
 * Cannot be abstract.
 * Cannot be static.
 */

interface MyInterface1 {
    default void method1() {
        commonLogic();
        System.out.println("Method1 logic");
    }

    default void method2() {
        commonLogic();
        System.out.println("Method2 logic");
    }

    private void commonLogic() {
        System.out.println("Common logic for default methods");
    }
}

class Demo implements MyInterface1 {
}

// Comment the below one first else this will throw error
/*
public class PrivateMethods {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.method1();
        obj.method2();
    }
}
 */

//B
/* Private Static Methods
 * Used for code reuse between static methods (or from default methods).
 * Can be called inside:
 * other static methods in the interface
 * default methods in the interface
 * Not inherited by implementing classes
 */
interface MyInterface2 {

    static void method1() {
        commonStaticLogic();
        System.out.println("Static Method1");
    }

    static void method2() {
        commonStaticLogic();
        System.out.println("Static Method2");
    }

    private static void commonStaticLogic() {
        System.out.println("Common static logic");
    }
}
/*
public class PrivateMethods {
    public static void main(String[] args) {
        MyInterface2.method1();
        MyInterface2.method2();
    }
}
 */

//Real World example
interface Logger {
    default void info(String msg) {
        if (isValid(msg)) log("INFO", msg);
    }

    default void error(String msg) {
        if (isValid(msg)) log("ERROR", msg);
    }

    private boolean isValid(String msg) {
        return msg != null && !msg.trim().isEmpty();
    }

    private void log(String level, String msg) {
        System.out.println(level + ": " + msg);
    }
}

class AppLogger implements Logger {}

/*
public class PrivateMethods {
    public static void main(String[] args) {
        AppLogger logger = new AppLogger();
        logger.info("App started");
        logger.error("Something went wrong");
    }
}
*/







