package Java_9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesEnhancement {
    public static void main(String[] args) throws FileNotFoundException {

        /* Before Java 9 (Java 7 & 8 behavior)
         * You could use try-with-resources only if you declared the resource inside the try() parentheses.
         */

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Can be also written as
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        try (br) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
