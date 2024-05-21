class Base4{
    public void method1(){      // method1 of Base4
        System.out.println("I am method 1 of class Base4.");
    }
    public void method2(){      // method2 of Base4
        System.out.println("I am method 2 of class Base4.");
    }
}
class Derived4 extends Base4{
    public void method2(){      // method2 of Derived4
        System.out.println("I am method 2 of class Derived4.");
    }
    public void method3(){      // method3 of Derived4
        System.out.println("I am method 3 of class Derived4.");
    }
}
public class _89_method_overriding {
    public static void main(String[] args) {
        Derived4 d = new Derived4();
        d.method1();    // calls method1 of base class as there is no method of that name in derived class
        d.method2();    // calls method2 of derived class as there is a method of that name in derived class
        // even though there's a method named method2 in base class as well, method2 of derived class gets called
        // this is called method overriding
        d.method3();    // calls method3 of derived class as there is a method of that name in derived class
    }
}
