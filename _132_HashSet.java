//import java.util.HashSet;       // importing the HashSet collections from java.util package
import java.util.*;             // importing everything from the java.util collections package

/*
 Hashing: A technique that converts key, value pairs
 Set: A collection of distinct elements
 HashSet: A set that uses the hashing technique to store and manage data
 Benefit of HashSet is that it processes searching of an element in linear time.
*/

public class _132_HashSet {
    public static void main(String[] args) {
        // Syntax to create a HashSet instance with default initial capacity(16) and default load factor(0.75)
        HashSet<Integer> H1 = new HashSet<>();  // an integer HashSet H1
        // Syntax to create a HashSet instance with custom initial capacity and default load factor(0.75)
        HashSet<Integer> H2 = new HashSet<>(20);
        // Syntax to create a HashSet instance with custom initial capacity and custom load factor
        HashSet<Integer> H3 = new HashSet<>(25,2);
        // Adding elements to a HashSet
        H1.add(3);          // H1: 3
        H1.add(44);         // H1: 3, 44
        H1.add(354);        // H1: 3, 44, 354
        H1.add(53);         // H1: 3, 44, 354, 53
        // Printing elements of a HashSet
        System.out.println(H1);     // will print the elements of the HashSet H1
        System.out.println(H2);     // will print an empty HashSet since H2 is empty

        /*
         Few common methods of HashSet are:
              add(), clear(), contains(), isEmpty(), remove(), size()
         which work in the same way as for the other collections like ArrayList, LinkedList and ArrayDeque.
        */
    }
}
