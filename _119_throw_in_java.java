import java.util.Scanner;

public class _119_throw_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        if(a<0){
            throw new ArithmeticException("Less than zero");
            // we can throw an exception using the throw keyword if our required condition is not met in the program
        }
        // below line will not be printed because we threw an exception but didn't catch it
        System.out.println("Sugoy daze. The exception was not encountered.");   // no
        // exceptions can be handled through try-catch block
    }
}
