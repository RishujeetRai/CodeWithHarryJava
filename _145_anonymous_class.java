interface MyInterface{
    void method1();
    void method2();
}
public class _145_anonymous_class {
    public static void main(String[] args) {
        // anonymous class can be used to override methods of an interface without creating another class
        // anonymous class doesn't have a name
        // we can instantiate an object to implement an interface's methods without creating another class
        // by overriding the methods of that interface during the instantiation of that object, as shown below
        MyInterface object = new MyInterface() {
            @Override   // using anonymous class, overriding the methods of interface without creating a class
            public void method1() {
                System.out.println("Method 1 overridden to print this.");
            }
            @Override   // in anonymous class as well, we must override all abstract methods of the interface
            public void method2() {
                System.out.println("Method 2 overridden to print this.");
            };
        };  // don't forget the semicolon at the end of the anonymous class

        object.method1();   // now we can use the overridden methods of the interface using the object
            // that was instantiated using the anonymous class
        object.method2();
    }
}
