import java.util.Scanner;

public class _06_hasNext_method {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();           // a will have an int
        // if you enter a non-int val in case of .nextInt(), compiler will throw an error
        boolean b = sc.hasNextInt();    // b is true if you enter int, false if you enter a non-int val
        // however, whatever input you enter in case of .hasNextInt(), the compiler will not throw any error
        // hasNext() method is used to check the validity of an expression
        System.out.println("The value in a is: "+a);
        System.out.println("b has an int value: "+b);
    }
}