package Java_11;

    /*
    Files utility methods for reading and writing text files.
    These make file handling way cleaner than the old BufferedReader / FileWriter boilerplate.
    */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesUtilityMethods {
    public static void main(String[] args) throws IOException {

        /*
        Files.writeString()
        Writes a String directly to a file.
        No need for FileWriter, BufferedWriter, or manual close calls.
         */
        Path path = Path.of("sample.txt");
        Files.writeString(path, "Hello, Java 11!");
        System.out.println("File written successfully.");

        /*
        Files.readString()
        Reads the entire file content into a String.
         */
        Path path1 = Path.of("sample.txt");
        String content = Files.readString(path1);
        System.out.println("File Content: " + content);

        /*
        Overloaded version for Charset
        If the file uses a different encoding:
         */
        String content1 = Files.readString(path, java.nio.charset.StandardCharsets.UTF_8);
    }
}
