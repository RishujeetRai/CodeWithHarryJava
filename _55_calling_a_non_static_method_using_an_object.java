public class _55_calling_a_non_static_method_using_an_object {
    // Creating a non-static method
    int logic(int x, int y){     // Syntax to create a non-static method
        // non-static methods can only be invoked via an object of the class enclosing it
        // so we create an object of the enclosing class, and then call the non-static methods via that object
        int z;
        if(x>y){
            z = (x+y)*6;
        }
        else{
            z = x+y;
        }
        return z;
    }
    // Below is our Java main method, the entry point of any java program
    public static void main(String[] args) {

        // Creating an object of the enclosing class (public class _55_calling_a_non_static_method_using_an_object)
        _55_calling_a_non_static_method_using_an_object obj = new _55_calling_a_non_static_method_using_an_object();

        int a = 5, b = 7;
        System.out.println(obj.logic(a,b));     // here, we called the method via the object of enclosing class

        int c = 7, d = 5;
        System.out.println(obj.logic(c,d));     // same
    }
}
