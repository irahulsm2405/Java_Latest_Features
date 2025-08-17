package Java_9;

/*
 * Before Java 9
 * The diamond operator (<>) was not allowed when creating anonymous inner classes.
 * You had to explicitly specify the type parameters, making code verbose.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondOperatorWithAnonymousInnerClasses {
    public static void main(String[] args) {

        // Here String is repeated
        List<String> list = new ArrayList<String>() {
            @Override
            public boolean add(String s) {
                System.out.println("Adding: " + s);
                return super.add(s);
            }
        };

        // After Java 9
        List<String> list1 = new ArrayList<>() {
            @Override
            public boolean add(String s) {
                System.out.println("Adding: " + s);
                return super.add(s);
            }
        };

        //Real world example
        Map<String, Integer> scores = new HashMap<>() {
            @Override
            public Integer get(Object key) {
                System.out.println("Fetching: " + key);
                return super.get(key);
            }
        };

        scores.put("Rahul", 100);
        System.out.println(scores.get("Rahul"));

    }
}
