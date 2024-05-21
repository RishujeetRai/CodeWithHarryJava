//import java.util.ArrayList;     // importing the ArrayList collections from java.util package
import java.util.*;             // importing everything from the java.util collections package

//  ArrayList methods used below: add(), addAll(), clear(), contains(), indexOf(), lastIndexOf(), remove(), set()

public class _129_ArrayList {
    public static void main(String[] args) {
        // Syntax to create an ArrayList instance
        ArrayList<Integer> A = new ArrayList<>();   // an ArrayList that stores Integers
        // Syntax to add elements at the end of ArrayList
        A.add(4);       // A: 4
        A.add(5);       // A: 4, 5
        A.add(6);       // A: 4, 5, 6
        A.add(7);       // A: 4, 5, 6, 7
        // Syntax to add elements at an index in ArrayList
        A.add(2,99);    // A: 4, 5, 99, 6, 7                    // added at 2nd index
        A.add(0,9);     // A: 9, 4, 5, 99, 6, 7                 // added at 0th index: first position
        A.add(5,999);   // A: 9, 4, 5, 99, 6, 999, 7            // added at 5th index
        A.add(7,9999);  // A: 9, 4, 5, 99, 6, 999, 7, 9999      // added at 7th index: last position
        // Syntax to get elements of an ArrayList
        for(int i=0; i<A.size(); i++){
            System.out.print(A.get(i)+" ");
        }
        System.out.println();
        // Syntax for enhanced for loop for an ArrayList
        for(Integer i : A){
            System.out.print(i+" ");
        }
        System.out.println();

        // Syntax to create an ArrayList instance with a custom set initial capacity
        ArrayList<Integer> A2 = new ArrayList<>(5);     // set initial capacity to 5
        // by default an instance of ArrayList in Java has initial capacity of 10
        A2.add(21); A2.add(22); A2.add(23); A2.add(24);     // adding elements to ArrayList A2

        // Syntax to add an ArrayList to another ArrayList
        A.addAll(A2);       // adds ArrayList A2 at the end of ArrayList A
        for (Integer i: A){
            System.out.print(i+" ");
        }
        System.out.println();

        // Syntax to add an ArrayList to another ArrayList at an index
        A2.addAll(2,A);     // adds the ArrayList A to the ArrayList A2 at index 2
        for(Integer i: A2){
            System.out.print(i+" ");
        }
        System.out.println();
        // Syntax to clear an ArrayList
        A2.clear();
        for(Integer i: A2){
            System.out.print(i+" ");    // will not print anything because A2 is clear/empty
        }
        System.out.println();

        // Syntax to check whether a given element is present in the ArrayList or not
        System.out.println(A.contains(3));  // returns true if ArrayList contains mentioned element otherwise false
        // Syntax to get the index of a possible element in ArrayList
        System.out.println(A.indexOf(99));  // returns the index of the element if it is present in the ArrayList
        System.out.println(A.indexOf(79));  // returns -1 if the element is not present in the ArrayList
        // Syntax to get the index of the last instance of a repeated element in an ArrayList
        A2.add(21); A2.add(22); A2.add(23); A2.add(22); A2.add(22);
        System.out.println(A2.lastIndexOf(22));     // returns index of last 22 from the ArrayList A2
        // Syntax to remove element at an index from ArrayList
        A2.remove(2);   // removes element at index 2 from A2
        for (Integer i: A2){
            System.out.print(i+" ");
        }
        System.out.println();

        // Syntax to add an element at an index by replacing the element at that position in an ArrayList
        A2.set(2,23);       // will add 23 at index 2 of A2 and replace the previous element at index 2 of A2
        A2.set(3,24);       // will add 24 at index 3 of A2 and replace the previous element at index 3 of A2
//        A2.set(4,25);       // will throw an error since index 4 is out of bound for ArrayList A2
        for (Integer i: A2){
            System.out.print(i+" ");
        }
        System.out.println();

        // Another way to print an ArrayList
        System.out.println(A);      // prints the ArrayList A
        System.out.println(A2);     // prints the ArrayList A2
    }
}