class Base1{
    Base1(){        // default constructor for base class
        System.out.println("Base class' constructor called.");
    }
}
class Derived1 extends Base1{   // Derived1 class derived from base class Base1
    Derived1(){     // default constructor for derived class
        System.out.println("Derived class' constructor called.");
    }
}
public class _85_constructor_inheritance_in_java {
    public static void main(String[] args) {
//        Base1 b = new Base1();          // base class constructor called
        Derived1 d = new Derived1();    // both derived class and base class constructors called
        // while making a derived class object, both the derived class and base class constructors are called
        // but the base class constructor is called before the derived class constructor
    }
}
