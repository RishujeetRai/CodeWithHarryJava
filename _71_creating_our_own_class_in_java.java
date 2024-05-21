// NOTE: we can't declare a public class Employee, because in a Java file
// there can be only one public class, and other classes take the default access modifier
class Employee{
    int id;
    String name;
    int salary = 34000;
    public void printDetails(){         // defining a method inside a class
        System.out.println("The id is: "+id);
        System.out.println("And the name is: "+name);
    }
    public int getSalary(){             // another method
        return salary;
    }
}   // doesn't require a semicolon like C++

public class _71_creating_our_own_class_in_java {
    public static void main(String[] args) {
        Employee E1 = new Employee();    // Instantiating an Employee object E1
        E1.id = 12;
        E1.name = "Rishu";
//        System.out.println(E.id);
//        System.out.println(E.name);
        E1.printDetails();
        System.out.println("The salary is: "+E1.getSalary());
        Employee E2 = new Employee();
        E2.id = 99;
        E2.name = "Chicken Sees Her Salad";
        E2.printDetails();
        System.out.println("The salary is: "+E2.getSalary());
    }
}
/*
    When we defined a method inside the class, we didn't use the keyword static,
    which means we created a non-static method,
    which means that that method could only be invoked through an object of that class.

    And if we had made defined a static method inside the class,
    we would be accessing an object's attributes like this:

        static public void printDetails(Employee E){        // passing the object as parameter
        System.out.println("The id is: "+E.id);             // then accessing its attributes
        System.out.println("And the name is: "+E.name);     // then accessing its attributes
        }
*/