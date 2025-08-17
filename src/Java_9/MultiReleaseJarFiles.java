package Java_9;

public class MultiReleaseJarFiles {
    public static void main(String[] args) {
        /*
        The Problem Before Java 9
        If you wanted to support multiple Java versions in the same library,
        you either: Compiled for the oldest version (losing new features), or Distributed separate JARs for each Java version.

        Java 9 Solution
        Multi-Release JARs let you put different versions of the same class in the same .jar file.

        At runtime, the JVM will automatically load the version that matches the Java version being used.

        Structure Example

        my-lib.jar
        │
        ├── META-INF/
        │   ├── MANIFEST.MF  (contains: Multi-Release: true)
        │   └── versions/
        │       ├── 9/
        │       │   └── com/example/MyClass.class   (Java 9+ version)
        │       └── 11/
        │           └── com/example/MyClass.class   (Java 11+ version)
        └── com/
            └── example/
                └── MyClass.class   (Java 8 fallback version)

        How It Works
        JVM loads classes from /com/example by default.

        If running on Java 9+, it will override the class with the one from /META-INF/versions/9/.

        If running on Java 11+, it will override with /META-INF/versions/11/, and so on.

        Manifest Example

        Manifest-Version: 1.0
        Multi-Release: true

        Why It’s Useful
        You can:
        Use Java 8 code for backward compatibility.
        Use newer APIs (like List.of(), var) in newer Java versions.
        One JAR → works across multiple Java versions.
         */
    }
}
