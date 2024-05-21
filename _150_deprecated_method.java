class myClass{
    @Deprecated     // declaring the below method as deprecated
    void method1(){
        System.out.println("This is getting printed through a deprecated method inside an outer class.");
    }
}
public class _150_deprecated_method {
    @Deprecated
     static void method2(){ // static so we don't have to make an object of _150_deprecated_method class to call
        System.out.println("This is getting printed through a deprecated method inside this file's class.");
    }
    public static void main(String[] args) {
        myClass C1 = new myClass();
        C1.method1();   // calling the deprecated method
        method2();
    }
}
