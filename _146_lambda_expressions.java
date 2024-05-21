interface anInterface1{
    // this interface is a functional interface since it has only one abstract method inside it
    void method1();
}
interface anInterface2{
    // this interface is also functional interface since it has only one abstract method inside it
    void method2(int a);    // except, its method takes a parameter
}
public class _146_lambda_expressions {
    public static void main(String[] args) {
        // lambda expressions can be used to directly override the one method inside a functional interface
        // using the below syntax
        anInterface1 obj1 = ()->{
            System.out.println("Method was overridden to print this using the lambda expression.");
        };
        obj1.method1();     // now we can call the overridden method using that object

        // we can override methods that take parameters as well using lambda expressions
        anInterface2 obj2 = (x)->{  // x symbolises the parameter which will be passed
            System.out.println("The parameter passed while calling this method had value: "+x);
        };
        obj2.method2(5);    // we pass the value like we normally do
    }
}
