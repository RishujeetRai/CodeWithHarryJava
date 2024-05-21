class Super{
    public void method1(){
        System.out.println("Method 1 of Super called.");
    }
    public void method2(){
        System.out.println("Method 2 of Super called.");
    }
}
class Sub extends Super{
    public void method2(){
        System.out.println("Method 2 of Sub called.");
    }
    public void method3(){
        System.out.println("Method 3 of Sub called.");
    }
}
public class _90_dynamic_method_dispatch_in_java {
    public static void main(String[] args) {
//        Sub s = new Super();        // not allowed
        Super S = new Sub();        // allowed

        S.method1();    // allowed and will invoke the method1 inherited from Super class by Sub class
        S.method2();    // allowed and will invoke the overridden method2 from Sub class
        // if method2 wasn't getting overridden in Sub class,
        // then method2 directly inherited from Super class would've been invoked

//        S.method3();    // not allowed as there's no method3 in Super class
        /*
         An object instantiated via Dynamic Method Dispatch can only access methods and properties
         that are available in both the superclass and subclass
         the subclass will have the methods and attributes of superclass through inheritance
         but the superclass will not have the methods and attributes of subclass via inheritance
         hence, usually the methods or attributes present in subclass but not in superclass
         are the ones that can't be accessed by objects instantiated via Dynamic Method Dispatch
        */

    }
}
