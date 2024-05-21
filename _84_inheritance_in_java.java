class Base{     // base class, superclass or parent class named Base
    int X;
    public void setX(int n){        // method to set the value of X
        X = n;
    }
    public int getX(){              // method to get the value of X
        return X;
    }
}
// Syntax for a derived class in Java
class Derived extends Base{     // derived class, subclass or parent class named Derived
    // this derived class has inherited the public (and protected) properties and methods of the base class Base
    // the objects of this derived class will have access to the properties and methods of both the classes
    int Y;
    public void setY(int y) {
        Y = y;
    }
    public int getY() {
        return Y;
    }
}
// Java DOES NOT support multiple inheritance
// meaning you can't make a derived class out of two base classes
public class _84_inheritance_in_java {
    public static void main(String[] args) {
        System.out.println("Using base class' object:");
        Base b = new Base();        // creating an object of base class Base
        b.setX(8);                  // setting value of X using base class' object
        System.out.println("The value of X is: "+b.getX()); // getting value of X using base class' object

        System.out.println("Using derived class' object:");
        Derived d = new Derived();  // creating an object of derived class Derived
        d.setX(8);                  // setting value of X using derived class' object
        System.out.println("The value of X is: "+d.getX()); // getting value of X using derived class' object
        d.setY(9);                  // setting value of X using derived class' object
        System.out.println("The value of X is: "+d.getY()); // getting value of X using derived class' object
    }
}
