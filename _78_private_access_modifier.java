class Employee3{
    private int id;
    String name;
    public void setId(int n){
        id = n;
    }
    public int getId(){
        return id;
    }
}

public class _78_private_access_modifier {
    public static void main(String[] args) {
        Employee3 E = new Employee3();
//        E.id = 36;              // Illegal since id is a private property of class Employee3
        E.name = "Harry";       // Legal since name is by default a public property of class Employee3

        E.setId(36);            // Legal since setId() is a method of class Employee3,
        // and hence has access to the private properties of the class Employee3
        // we have access to setID() because this method itself is a public method of Employee3

        System.out.println(E.getId());      // accessing id through a method
        System.out.println(E.name);         // direct access to the name
    }
}
