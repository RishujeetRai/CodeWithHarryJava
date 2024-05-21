// Employee2 because we already made a class with name Employee in this folder/package
class Employee2{
    String name;        // by default has null value
    int salary;         // by default has null value
    public void setName(String s){
        name = s;
    }
    public void setSalary(int n){
        salary = n;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
}
public class _72_class_Employee_and_its_methods {
    public static void main(String[] args) {
        Employee2 E1 = new Employee2();
        E1.setName("Harry");
        E1.setSalary(10000);
        System.out.println(E1.getName());
        System.out.println(E1.getSalary());
        Employee2 E2 = new Employee2();
        E2.setName("Rishu");
        E2.setSalary(100000);
        System.out.println(E2.getName());
        System.out.println(E2.getSalary());
    }
}
