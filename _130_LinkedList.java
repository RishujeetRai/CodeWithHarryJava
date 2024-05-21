//import java.util.LinkedList;    // importing the LinkedList collections from java.util package
import java.util.*;             // importing everything from the java.util collections package

/*
  ArrayList shifts all its elements in case of addition or deletion of an element in between the ArrayList
  While LinkedList uses the concept of pointers or embedded object to manage its elements

  ArrayList internally uses a dynamic array to store its elements.
  LinkedList uses Doubly Linked List to store its elements.
  ArrayList is slow as array manipulation is slower.
  LinkedList is faster being node based as not much bit shifting is required.

  LinkedList and ArrayList have very similar methods also, except for a few.
  Same as ArrayList methods, LinkedList methods used below: (24-93)
        add(), addAll(), clear(), contains(), indexOf(), lastIndexOf(), remove(), set()
  Different from ArrayList methods, LinkedList methods used below: (95-102)
        addFirst(), addLast()
*/

public class _130_LinkedList {
    public static void main(String[] args) {
        // Syntax to create a LinkedList instance
        LinkedList<Integer> L = new LinkedList<>();   // a LinkedList that stores Integers
        // Syntax to add elements at the end of LinkedList
        L.add(4);       // L: 4
        L.add(5);       // L: 4, 5
        L.add(6);       // L: 4, 5, 6
        L.add(7);       // L: 4, 5, 6, 7
        // Syntax to add elements at an index in LinkedList
        L.add(2,99);    // L: 4, 5, 99, 6, 7                    // added at 2nd index
        L.add(0,9);     // L: 9, 4, 5, 99, 6, 7                 // added at 0th index: first position
        L.add(5,999);   // L: 9, 4, 5, 99, 6, 999, 7            // added at 5th index
        L.add(7,9999);  // L: 9, 4, 5, 99, 6, 999, 7, 9999      // added at 7th index: last position
        // Syntax to get elements of an LinkedList
        for(int i=0; i<L.size(); i++){
            System.out.print(L.get(i)+" ");
        }
        System.out.println();
        // Syntax for enhanced for loop for a LinkedList
        for(Integer i : L){
            System.out.print(i+" ");
        }
        System.out.println();

        // Can't set initial capacity in a LinkedList
//        LinkedList<Integer> L2 = new LinkedList<>(5);     // throws an error

        LinkedList<Integer> L2 = new LinkedList<>();
        L2.add(21); L2.add(22); L2.add(23); L2.add(24);     // adding elements to LinkedList L2

        // Syntax to add a LinkedList to another LinkedList
        L.addAll(L2);       // adds LinkedList L2 at the end of LinkedList L
        for (Integer i: L){
            System.out.print(i+" ");
        }
        System.out.println();

        // Syntax to add a LinkedList to another LinkedList at an index
        L2.addAll(2,L);     // adds the LinkedList L to the LinkedList L2 at index 2
        for(Integer i: L2){
            System.out.print(i+" ");
        }
        System.out.println();
        // Syntax to clear a LinkedList
        L2.clear();
        for(Integer i: L2){
            System.out.print(i+" ");    // will not print anything because L2 is clear/empty
        }
        System.out.println();

        // Syntax to check whether a given element is present in the LinkedList or not
        System.out.println(L.contains(3));  // returns true if LinkedList contains mentioned element otherwise false
        // Syntax to get the index of a possible element in LinkedList
        System.out.println(L.indexOf(99));  // returns the index of the element if it is present in the LinkedList
        System.out.println(L.indexOf(79));  // returns -1 if the element is not present in the LinkedList
        // Syntax to get the index of the last instance of a repeated element in an LinkedList
        L2.add(21); L2.add(22); L2.add(23); L2.add(22); L2.add(22);
        System.out.println(L2.lastIndexOf(22));     // returns index of last 22 from the LinkedList L2
        // Syntax to remove element at an index from LinkedList
        L2.remove(2);   // removes element at index 2 from L2
        for (Integer i: L2){
            System.out.print(i+" ");
        }
        System.out.println();

        // Syntax to add an element at an index by replacing the element at that position in a LinkedList
        L2.set(2,23);       // will add 23 at index 2 of L2 and replace the previous element at index 2 of L2
        L2.set(3,24);       // will add 24 at index 3 of L2 and replace the previous element at index 3 of L2
//        L2.set(4,25);       // will throw an error since index 4 is out of bound for LinkedList L2
        for (Integer i: L2){
            System.out.print(i+" ");
        }
        System.out.println();

        // Syntax to add an element at the end of the LinkedList (same as add(element) method)
        L2.addLast(25);     // adds 25 to the end of L2 (same as add(25) method would've done)
        // Syntax to add an element at the beginning of the LinkedList (same as add(0,element) method)
        L2.addFirst(20);    // adds 20 at the beginning of L2 (same as add(0,20) method would've done)
        for (Integer i: L2){
            System.out.print(i+" ");
        }
        System.out.println();

        // Another way to print a LinkedList
        System.out.println(L);      // prints the LinkedList L
        System.out.println(L2);     // prints the LinkedList L2
    }
}
