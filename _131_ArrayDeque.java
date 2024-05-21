//import java.util.ArrayDeque;    // importing the ArrayDeque collections from java.util package
import java.util.*;             // importing everything from the java.util collections package

/*
 ArrayDeque stands for Array Doubly Ended Queue in Java, also known as ArrayDeck.
 It is a special kind of growable array that allows us to add or remove an element from both sides.
 An ArrayDeque implementation can be used as a Stack (Last-In-First-Out) or a Queue(First-In-First-Out).
*/

public class _131_ArrayDeque {
    public static void main(String[] args) {
        // Syntax to create an ArrayDeque with default initial capacity(16)
        ArrayDeque<Integer> D1 = new ArrayDeque<>();        // An ArrayDeque with default initial capacity 16
        // but we can create an ArrayDeque with our own custom initial capacity as well
        ArrayDeque<Integer> D2 = new ArrayDeque<>(20);  // ArrayDeque with initial capacity of 20 elements
        // NOTE: this capacity doesn't mean that an ArrayDeque has size restrictions
        // it will resize itself once its initial capacity is exceeded

        // Syntax to add element at the end of the ArrayDeque
        D1.add(1);      // D1: 1
        D1.add(2);      // D1: 1, 2
        D1.add(3);      // D1: 1, 2, 3
        // Another way to add element at the end of the ArrayDeque
        D1.addLast(4);      // D1: 1, 2, 3, 4
        D1.addLast(5);      // D1: 1, 2, 3, 4, 5
        D1.addLast(6);      // D1: 1, 2, 3, 4, 5, 6
        // Syntax to add element at the beginning of the ArrayDeque
        D1.addFirst(9);     // D1: 9, 1, 2, 3, 4, 5, 6
        D1.addFirst(8);     // D1: 8, 9, 1, 2, 3, 4, 5, 6
        D1.addFirst(7);     // D1: 7, 8, 9, 1, 2, 3, 4, 5, 6
        for(Integer i: D1){
            System.out.print(i+" ");
        }
        System.out.println();

        // Syntax to add one ArrayDeque at the end of another ArrayDeque
        D2.add(9); D2.add(99); D2.add(999);     // D2: 9, 99, 999
        D2.addAll(D1);  // adds the ArrayDeque D1 at the end of the ArrayDeque D2
        for(Integer i: D2){
            System.out.print(i+" ");
        }
        System.out.println();

        // Syntax to get the first element of an ArrayDeque
        System.out.println(D1.getFirst());      // prints the first element of the ArrayDeque D1
        // Syntax to get the last element of an ArrayDeque
        System.out.println(D1.getLast());       // prints the last element of the ArrayDeque D1

        // Another way to print an ArrayDeque
        System.out.println(D1);     // prints the ArrayDeque D1
        System.out.println(D2);     // prints the ArrayDeque D2
    }
}
