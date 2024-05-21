/*
 There are three types of errors in java.
 1) Syntax errors
 2) Logical errors
 3) Runtime errors - also called Exceptions

 Syntax Errors
 When compiler finds something wrong with our program,
 it throws a syntax error

 Logical errors
 A logical error or a bug occurs when a program
 compiles and round but does the wrong thing.
 - Message delivered wrongly
 - Wrong time of chats being displayed
 - Incorrect redirects

 Runtime errors
 Java may sometimes encounter an error while the program is running.
 These are also called Exceptions!
 These are encountered due to circumstances like bad input and (or) resource constraints.
 Ex: User supplies 'S' + 8 to a program that adds 2 numbers.

 Syntax errors and logical errors are encountered by the programmers,
 whereas Run-time errors are encountered by the users.
*/
import java.util.Scanner;
public class _114_syntax_logical_runtime_errors {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 0  // Error: no semicolon!
        // b = 8;     // Error: b not declared!

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 and 10
        System.out.println("Prime numbers between 1 and 10 are:");
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);      // prints 9 also which is not a prime number
        }

        // RUNTIME ERROR DEMO
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to divide 1000 by it: ");
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);    // throws error when k=0
    }
}
