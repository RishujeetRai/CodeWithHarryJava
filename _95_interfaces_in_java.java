// a java interface is a group of related methods with empty bodies
interface Bicycle{
    // variables in interfaces are final and their values can not be modified later
    int speed=0;    // a variable of this interface (must be initialized at declaration)
    void applyBrake();      // method signature to be implemented
    void speedUp();         // another method signature to be implemented
}
// syntax to implement an interface
class AvonCycle implements Bicycle{
    void blowHorn(){    // a method of this class
        System.out.println("Blowing horn...");
    }
    // the use of public keyword while overriding the methods of the interface is a must
    public void applyBrake(){       // overriding method of an interface
        System.out.println("Decelerating from: "+speed); // we can use the variables of an interface like this
//        speed = speed - dec;    // but assigning value to a variable of an interface is not allowed
    }
    public void speedUp(){          // overriding another method of the interface
        System.out.println("Accelerating from: "+speed);
    }
}
/*
 also, a class implementing an interface should either be an abstract class itself
 or override the methods of the interface

 also, at a time:
 a class can extend from another class, and implement multiple interfaces
 an interface can extend from multiple interfaces, but can't implement another interface
 a class can't extend from multiple classes, but an interface can extend from multiple classes
*/
abstract class VickyVSTAR implements Bicycle{
    // this class doesn't override the methods of the interface it is implementing
    // still it doesn't throw an error because it is an abstract class itself
}
public class _95_interfaces_in_java {
    public static void main(String[] args) {
        Bicycle B = new AvonCycle();        // valid through Dynamic Method Dispatch
        B.speedUp();
        B.applyBrake();
        AvonCycle A = new AvonCycle();      // valid since AvonCycle is not abstract
        A.speedUp();
        A.applyBrake();
    }
}
