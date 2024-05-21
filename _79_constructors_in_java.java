class Employee4{
    int id;
    String name;
    // Methods to set values for id and name
//    public void setId(int n){
//        id = n;
//    }
//    public void setName(String s){
//        name = s;
//    }

    // Rather than making multiple methods to set values to the properties of the class
    // we can define a constructor
    public Employee4(){         // a default constructor    // constructor has no return value (not even void)
        id = 45;                // constructor will get called at the declaration of this class' objects
        name = "Harry";         // and by default set the value of id and name to 45 and Harry respectively
    }

    public Employee4(int n, String s){      // a parametrized constructor   // again no return type
        id = n;
        name = s;
    }
    // we can have both default and parametrized constructor in a class by the rule of constructor overloading
}
public class _79_constructors_in_java {
    public static void main(String[] args) {
        Employee4 e1 = new Employee4();              // calling a default constructor
        Employee4 e2 = new Employee4(36,"Rishu");    // calling a parametrized constructor
        System.out.println("The id of e1 is: "+e1.id+" and the name is: "+e1.name);
        System.out.println("The id of e2 is: "+e2.id+" and the name is: "+e2.name);
    }
}
