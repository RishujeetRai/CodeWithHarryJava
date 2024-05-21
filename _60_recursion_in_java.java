public class _60_recursion_in_java {
    // when a function calls itself, it's called recursion
    static int factorial(int n){
        if(n==0){                       // base condition
            return 1;                   // returns 1 as the product, or to the product in case of recursion
        }
        else{
            return n*factorial(n-1);
            // n*(n-1)*(n-2)*(n-3)... till n-n=0 (base condition), which will lastly multiply 1 to product
        }
    }

    public static void main(String[] args) {
        System.out.println("The factorial of 0 is: "+factorial(0));
        System.out.println("The factorial of 1 is: "+factorial(1));
        System.out.println("The factorial of 2 is: "+factorial(2));
        System.out.println("The factorial of 3 is: "+factorial(3));
        System.out.println("The factorial of 4 is: "+factorial(4));
        System.out.println("The factorial of 5 is: "+factorial(5));
        System.out.println("The factorial of 10 is: "+factorial(10));
    }
}
