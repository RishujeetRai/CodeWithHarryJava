import java.util.Scanner;

class NegativeRadiusException extends Exception{    // creating our own kind of exception
    @Override
    public String toString() {
        return "Negative radius exception occurred.";
    }
}
public class _122_custom_exception_with_throw_and_throws {
    // creating a method that throws that kind of exception
    public static double area(double r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();    // throwing that exception
        }
        else return Math.PI*r*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle's radius to calculate its area: ");
        double radius = sc.nextDouble();
        try{
            System.out.println(area(radius));
        }
        catch (Exception e){    // catching that exception in case it is thrown
            System.out.println("Exception caught.");
            System.out.println(e);
        }
    }
}
