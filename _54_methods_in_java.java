public class _54_methods_in_java {
    // A method is a function written inside a class.
    // Creating a method                // here, this method is written inside the public class _54_methods_in_java
    static int logic(int x, int y){     // Syntax to create a static method
    // we use static keyword so we can invoke the method without creating an object of the class enclosing it
    // static methods are associated with the class itself, and don't need to associate with an object
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
        int a = 5, b = 7;
        System.out.println(logic(a,b));     // here, we don't need an object to call logic method
        // because it is associated with the class _54_methods_in_java, and can be called within it independently

        int c = 7, d = 5;
        System.out.println(logic(c,d));     // same, we don't need an object of the class to invoke a static method
        // they can be called independently
    }
}
