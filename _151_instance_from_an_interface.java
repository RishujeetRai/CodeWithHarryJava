interface myInterface1{
    void method1();
    void method2();
}
interface myInterface2{ // this is a functional interface since it has only one abstract method inside
    void method3();
}
public class _151_instance_from_an_interface {
    public static void main(String[] args) {
        // myInterface1 is not a functional interface since it has more than one abstract method inside
        // so we can instantiate an object through it using the concept of anonymous class
        myInterface1 obj1 = new myInterface1() {
            @Override
            public void method1() {
                System.out.println("Overridden method1 of myInterface1.");
            }
            @Override
            public void method2() {
                System.out.println("Overridden method2 of myInterface1.");
            }
        };
        // myInterface2 is a functional interface so we can either use the concept of anonymous class
        // or we can also use a lambda expression to instantiate an object through it
        myInterface2 obj2 = () -> {
            System.out.println("Overridden method3 of myInterface2.");
        };
        // calling the overridden methods through their respective objects
        obj1.method1();
        obj1.method2();
        obj2.method3();
    }
}
