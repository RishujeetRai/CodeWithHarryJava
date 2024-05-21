import java.util.InputMismatchException;
import java.util.Scanner;

public class _125_haha_hehe_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter two integers to get their division: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("The division returns: "+a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }
        catch (InputMismatchException e){
            System.out.println("Hehe");
        }
    }
}
