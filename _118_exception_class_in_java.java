// we can write our own custom exceptions using the Exception class in Java

import java.util.Scanner;

class MyException extends Exception{    // extending the exception class
    @Override
    public String toString() {      // overriding the toSting() method of the Exception class
        return super.toString() + " from toString()";
    }
    @Override
    public String getMessage() {    // overriding the getMessage() method of the Exception class
        return super.getMessage() + " from getMessage()";
    }
}

public class _118_exception_class_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        if(a<9){
            try {
                throw new MyException();    // throwing an exception
            }
            catch (MyException e){
                System.out.println(e.toString());       // calls toString() method of MyException class
                System.out.println(e.getMessage());     // calls getMessage() method of MyException class
                System.out.println(e);                  // calls toString() method of MyException class
                e.printStackTrace();    // will print the stacktrace at the end of the program
            }
        }
        System.out.println("Finished.");
    }
}