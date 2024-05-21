import java.util.Scanner;

public class _120_handling_thrown_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        if(a<0){
            try{
                throw new ArithmeticException("Less than zero da!");
                // string passed above will not be printed because we handled that exception
            }
            catch (ArithmeticException e){
                System.out.println("Arithmetic exception encountered.");
            }
        }
        System.out.println("Great. The exception was finally handled.");    // yes
    }
}
