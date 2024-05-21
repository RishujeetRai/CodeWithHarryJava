import java.util.InputMismatchException;
import java.util.Scanner;
class InvalidChoiceException extends Exception{
    @Override
    public String toString() {
        return "Invalid choice entered.";
    }
}
public class _127_custom_calculator {
    public static int calc(int a, int b) throws InvalidChoiceException{
        System.out.println("Which operation you want to perform:");
        System.out.println("Press 1 for +");
        System.out.println("Press 2 for -");
        System.out.println("Press 3 for *");
        System.out.println("Press 4 for /");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if(c==1) return a+b;
        else if(c==2) return a-b;
        else if(c==3) return a*b;
        else if(c==4) return a/b;
        else throw new InvalidChoiceException();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Welcome to our stupid calculator.");
            System.out.println("Enter two integer value to perform an operation on them.");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print(calc(a,b));
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero. I mean come on.");
        }
        catch (InputMismatchException e){
            System.out.println("Enter valid inputs!");
        }
        catch (InvalidChoiceException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Jeez. You done fcked up, bruh. I mean, I don't know wtf u did, but u did something.");
        }
    }
}
