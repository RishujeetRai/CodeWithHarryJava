class Base2{
//    Base2(){            // a default constructor for base class
//        System.out.println("Base class' constructor called.");
//    }
    Base2(int a){        // a parametrized constructor for base class
        System.out.println("Base class' parametrized constructor with value "+a+" called.");
    }
}
class Derived2 extends Base2{       // Derived1 class derived from base class Base1
    Derived2(){         // a default constructor for derived class
    // a default derived class constructor will by default look for a default base class constructor
    // and will throw error if it fails to find a default base class constructor
    // this error can be fixed by manually calling a parametrized base class constructor using the super() keyword
        super(100);     // fixing the error caused by the absence of default constructor in the base class
        // by calling the parametrized constructor of the base class using the super() keyword
        System.out.println("Derived class' constructor called.");
    }
    Derived2(int a){    // a parametrized derived class constructor
    // even a parametrized derived class constructor by default looks for a default base class constructor
        super(11);     // calling a single parametrized base class constructor
        System.out.println("Derived class' parametrized constructor with value "+a+" called.");
    }
}
/*
 super() keyword is used to call the base class methods and constructors
 it can be used to call a parametrized base class constructor even in presence of a default constructor
 super() keyword can have parameters or no parameters depending on the base class constructors

 most common use of the super() is to eliminate the confusion bw derived and base classes
 that have methods with the same name
*/
/*
 NOTE: All classes have a default constructor but if we define a parametrized constructor in a class,
 the default one gets overwritten, and then we have to provide another default constructor by ourselves
 if we want the class to have a default constructor
*/
public class _86_parametrized_constructor_inheritance_and_super_keyword_in_java {
    public static void main(String[] args) {
//        Base2 b = new Base2();          // base class constructor called

        Derived2 d1 = new Derived2();    // both derived class and base class constructors called
        /*
         by default the default base class constructor is called
         and if the base class doesn't have a default constructor, the program throws an error
         we can fix this error by using super() keyword to invoke the parametrized constructor of the base class
         from within the derived class constructor

         also, if we use the super() keyword in the derived class constructor
         and there lies a default constructor in the base class,
         the constructor getting called by super() will be the only one getting called
         super() can call default as well as parametrized constructors
         depending on the values passed to super() as parameters
        */

        Derived2 d2 = new Derived2(10); // parametrized constructor of the derived class will be called
        // and since we have used super() keyword with a parameter in that parametrized derived class constructor,
        // the parametrized constructor of the base class will also be called
    }
}
