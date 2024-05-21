// an abstract class is a class having one or more abstract methods
// an abstract method is a method declared without implementation
// an abstract class without an abstract method will not throw an error
// but an abstract method without an abstract class will throw an error
abstract class Parent{      // an abstract class to hold abstract methods
    int a;
    public Parent(){        // a default constructor of this class
        System.out.println("Parent class constructor called.");
    }
    public void hello(){    // another method of this class
        System.out.println("Hello...");
    }
    public abstract void namaste();     // an abstract method
    // an abstract method doesn't have a body because its whole point is to get overridden once it is inherited
}
/*
 a derived class from an abstract parent class should either override the abstract methods of the parent class
 or also be an abstract class itself
*/
class Child1 extends Parent{
    int b;
    public void namaste(){      // overriding the abstract method of the Parent class
        System.out.println("Namaste...");
    }
    // the return types of both methods, the abstract one and the one we get after overriding, should be the same
    public Child1(){        // a default constructor of this class
        System.out.println("Child1 class constructor called.");
    }
}
abstract class Child2 extends Child1{       // the derived class is also abstract
    // rather than overriding the abstract methods of the parent class,
    // making the base class abstract also solves the error because,
    // the base class inherits the abstract methods from the parent class,
    // and only an abstract class can have abstract methods
    // hence, we can either make the base class abstract itself,
    // or override the abstract methods inherited by the base class
    int c;
}
public class _94_abstract_method_and_abstract_class {
    public static void main(String[] args) {
//        Parent P1 = new Parent();       // can't instantiate an object using an abstract class
        Parent P2 = new Child1();       // valid through dynamic method dispatch (DMD)
//        Parent P3 = new Child2();       // again invalid because Child2 is abstract class
        Child1 C1 = new Child1();       // valid because Child1 is not an abstract class
//        Child1 C2 = new Parent();       // invalid again, Parent class is abstract, also invalid form of DMD
//        Child1 C3 = new Child2();       // invalid again, Child2 class is abstract, also invalid form of DMD
//        Child2 C4 = new Child2();       // invalid, Child2 is an abstract class
//        Child2 C5 = new Parent();       // invalid, Parent is an abstract class
//        Child2 C6 = new Child1();       // invalid form of DMD (dynamic method dispatch)

        // based on the order of execution of constructors,
        // we can say that P2 and C1 are both objects of Child1 class

        // so, P2 is an object of the subclass Child1 made as a reference of the superclass Parent
        // and can only access the methods available in Parent, or Parent's methods getting overridden in Child1
    }
}
