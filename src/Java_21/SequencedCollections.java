package Java_21;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;

/*
Java 21, we had collections like List, Set, and Map that sometimes had an order (like ArrayList or LinkedHashMap) 
but there was no common interface to guarantee and work with that order in a standard way.

Sequenced Collections introduces three new interfaces:
SequencedCollection (extends Collection)
SequencedSet (extends Set & SequencedCollection)
SequencedMap (extends Map)

These interfaces define well-defined encounter order and new methods to work with first, last, reversed elements.
 */

public class SequencedCollections {
	public static void main(String[] args) {

		
		// Sequenced  list
        SequencedCollection<String> list = new ArrayList<>();
        
        list.addFirst("A");
        list.addLast("B");
        list.addLast("C");
        
        System.out.println(list.getFirst()); // A
        System.out.println(list.getLast());  // C
        
        System.out.println("Reversed: " + list.reversed()); // [C, B, A]
        
        //Sequenced Set
        SequencedSet<String> set = new LinkedHashSet<>();

        set.addFirst("A");
        set.addLast("B");
        set.addLast("C");

        System.out.println(set.getFirst()); // A
        System.out.println(set.getLast());  // C

        set.removeFirst();
        System.out.println(set);            // [B, C]

        System.out.println("Reversed: " + set.reversed()); // [C, B]
        
        
        //Sequenced Map
        SequencedMap<Integer, String> map = new LinkedHashMap<>();
        
        map.putFirst(1, "One");
        map.putLast(2, "Two");
        map.putLast(3, "Three");
        
        System.out.println(map.firstEntry()); // 1=One
        System.out.println(map.lastEntry());  // 3=Three
        
        System.out.println("Reversed Map: " + map.reversed());
	}
}
