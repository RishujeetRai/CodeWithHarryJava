public class _57_method_overloading {
    static void foo(){
        System.out.println("Returns void. Takes nothing.");
    }
    // We can overload a method by changing the type or number of parameters it takes.
    // Overloading a method means, different methods have same names but function differently,
    // based on the type or number of parameters it takes.
    static void foo(int x){
        System.out.println("Returns void. Takes an integer. "+x+" passed.");
    }
//    static int foo(){         // Illegal overloading. Can't overload a method by changing return type.
//        System.out.println("Returns an integer. Takes nothing.");
//        return 0;
//    }
    static int foo(int a, int b){       // Legal. Overloaded method foo by changing the parameters it takes.
        System.out.println("Returns an integer. Takes two integers. "+a+" and "+b+" passed. "+(a+b)+" returned.");
        return a+b;
    }

    public static void main(String[] args) {
        foo();                  // foo method that takes nothing
        foo(36);                // foo method that takes an integer
        int a = foo(34,35);     // foo method that takes two integers and returns an integer
    }
}
