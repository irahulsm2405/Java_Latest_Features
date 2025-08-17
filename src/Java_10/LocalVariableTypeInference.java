package Java_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalVariableTypeInference {
    public static void main(String[] args) {

        // old way
        String message = "Hello, world!";
        ArrayList<String> names = new ArrayList<String>();

        // new way
        var message1 = "Hello, world!";           // compiler infers String
        var names1 = new ArrayList<String>();     // compiler infers ArrayList<String>

        // Before
        Map<String, List<String>> data = new HashMap<String, List<String>>();

        // After
        var data1 = new HashMap<String, List<String>>();
    }
}
