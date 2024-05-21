import java.util.InputMismatchException;
import java.util.Scanner;
public class _116_handling_specific_exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = 23;
        arr[1] = 24;
        arr[2] = 25;
        try{
            System.out.println("Enter the array index: ");
            int ind = sc.nextInt();
            System.out.println("Enter the number you want to divide with: ");
            int num = sc.nextInt();
            System.out.println("The value at index "+ind+" is: "+arr[ind]);
            System.out.println("The quotient after dividing it with "+num+" is: "+arr[ind]/num);
        }
        catch(ArithmeticException e){
            // will handle the arithmetic exception
            System.out.println("ArithmeticException occurred.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            // will handle the invalid index exception
            System.out.println("ArrayIndexOutOfBoundsException occurred.");
        }
        catch(InputMismatchException e){
            // will handle the invalid input exception
            System.out.println("InputMismatchException occurred.");
        }
        catch(Exception e){
            // will handle any other exception occurring in the try block
            System.out.println("Some other exception occurred.");
        }
    }
}
