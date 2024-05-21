import java.util.Scanner;

public class _123_finally_block_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            System.out.println("The division returns: "+a/b);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            // the code within the finally block is always executed whether the exception has been encountered or not
            System.out.println("End of the program.");
        }
        // a try block alone is invalid, it always expects either a catch block or a finally block after it
        // though, even if we put a finally block, the compiler won't give an error, but the exception will
        // so to catch that exception, and error-free run of our program, we provide the catch block
    }
}
