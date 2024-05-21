/*
 Exceptions in Java
 An exception is an event that occurs when a program is executed disrupting the normal flow of instructions.
 There are mainly two types of exceptions in java:
 1) Checked exceptions - compile-time exceptions (handled by the compiler)
 2) Unchecked exceptions - runtime exceptions

 Commonly Occurring Exceptions
 Following are few commonly occurring exceptions in java:
 1) Null pointer exception
 2) Arithmetic Exception
 3) Array Index out of Bound exception
 4) Illegal Argument Exception
 5) Number Format Exception
*/
import java.util.Scanner;
public class _115_try_catch_block {
    public static void main(String[] args) {
        // unchecked exceptions or runtime exceptions can be handled through try-catch block in java
        Scanner sc = new Scanner(System.in);
        int a = 1000;
        System.out.print("Enter an integer to divide "+a+" by it: ");
        int b = sc.nextInt();
        // Syntax for try-catch block
        try{
            System.out.println("The quotient is: "+a/b);
        }
        catch (Exception e){
            System.out.println("Runtime exception occurred.");
            System.out.println("Reason: "+e);
        }
        // exception handling saves our program from any unexpected interruption
    }
}
