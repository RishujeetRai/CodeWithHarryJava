import java.util.Scanner;                           // importing the scanner class to take input

public class _05_taking_float_input_from_user {
    public static void main(String[] args){
        System.out.println("Taking floating point input from the user:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        float a = sc.nextFloat();       // taking a float number as input and placing it in float variable a
        // .nextFloat() to take a float number as input, similarly, .next(), .nextByte(), .nextInt(), etc.

        System.out.println("Enter num2: ");
        float b = sc.nextFloat();

        float sum = a + b;
        System.out.println("The sum is: ");
        System.out.println(sum);
    }
}
