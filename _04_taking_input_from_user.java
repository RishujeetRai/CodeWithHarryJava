import java.util.Scanner;                           // importing the scanner class to take input

public class _04_taking_input_from_user {
    public static void main(String[] args){
        System.out.println("Taking input from the user:");

        Scanner sc = new Scanner(System.in);    // creating an object sc to use functions of class Scanner
        // System.in to assign what function sc will perform: it will take input from the console

        System.out.println("Enter num1: ");
        int a = sc.nextInt();       // taking an integer as input and placing it in integer variable a
        // .nextInt() to take an integer as input, similarly, .next(), .nextByte(), .nextFloat(), etc.

        System.out.println("Enter num2: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum is: ");
        System.out.println(sum);
    }
}
