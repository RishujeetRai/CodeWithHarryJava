class Base3{
    Base3(){            // a default constructor for base class
        System.out.println("Base class' constructor called.");
    }
    Base3(int a){        // a parametrized constructor for base class
        System.out.println("Base class' parametrized constructor with value "+a+" called.");
    }
}
class Derived3 extends Base3{       // Derived1 class derived from base class Base1
    Derived3(){         // a default constructor for derived class
        super(100);     // calling the parametrized base class constructor using super() keyword
        System.out.println("Derived class' constructor called.");
    }
    Derived3(int a){    // a parametrized derived class constructor
        super(11);      // calling the parametrized base class constructor using super() keyword
        System.out.println("Derived class' parametrized constructor with value "+a+" called.");
    }
}
class childDerived3 extends Derived3{   // a class derived from the derived class Derived3
    childDerived3(){    // default constructor
        // will by default call the default constructor of Derived2
        System.out.println("Child derived class' constructor called.");
    }
    childDerived3(int b){    // default constructor
        super(10);      // calling the parametrized constructor of Derived2
        System.out.println("Child derived class' parametrized constructor with value "+b+" called.");
    }
}
public class _87_constructor_execution_hierarchy_in_java {
    public static void main(String[] args) {
        childDerived3 cd1 = new childDerived3();    // default constructor of childDerived3 will be called
        // first the superclass' constructor gets called
        // then the subclass' constructor gets called
        // then the sub-subclass' constructor gets called
        // and such is the hierarchy of calling of constructors in inheritance
        childDerived3 cd2 = new childDerived3(5);   // parametrized constructor of childDerived3 will be called
        // all constructors will be called according to the hierarchy of calling of constructors in inheritance
    }
}
