public class _121_throws_in_java {
    // creating a method (always create a method inside a class or an interface in java)
    public static int div(int a, int b) throws ArithmeticException{
        // using the throws keyword, we can prepare a method for an exception
        // this exception will still have to be handled wherever this method is called
        return a/b;
    }
    public static void main(String[] args) {
        try{    // handling the possible exception this method throws
            System.out.println(div(6,0));
        }
        catch (Exception e){    // catching that exception
            System.out.println("Exception occurred.");
        }
    }
}
