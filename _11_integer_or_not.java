import java.util.Scanner;

public class _11_integer_or_not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        boolean b = sc.hasNextInt();
        if(b) System.out.print("Entered value was an integer.");
        else System.out.print("Entered value was not an integer.");
    }
}
