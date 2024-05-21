//  at a time:
//    a class can extend from another class, and implement multiple interfaces
//    an interface can extend from multiple interfaces, but can't implement another interface
//    a class can't extend from multiple classes, but an interface can extend from multiple classes
interface I1{
    int a = 0;
    void methodI1();
}
interface I2{
    int b = 0;
    void methodI2();
}
class C1 implements I1, I2{     // valid since a class can implement multiple interfaces at once
    public void methodI1() {    // overriding methodI1 from interface I1
        System.out.println("I1 method overridden by class C1.");
    }
    public void methodI2() {    // overriding methodI2 from interface I2
        System.out.println("I2 method overridden by class C1.");
    }
}
interface I3 extends I1, I2{    // valid since an interface can extend from multiple interfaces at once
    int c=0;
    void methodI3();
}
class C2 extends C1 implements I1, I2{
    // we don't have to declare this class C2 as abstract or override methods from interfaces I1 and I2
    // because C2 already inherited the overridden methods of I1 and I2 by extending from C2
}
class C3 extends C2 implements I3{
    // this class C3 has to override the methodI3() from interface I3 because
    // neither class C2 nor C1 (inherited by C2) has implemented and overridden the methodI3() of interface I3
    public void methodI3(){
        System.out.println("I3 method overridden by class C3.");
    }
}
public class _96_multiple_interfaces_implementation_and_inheritance {
    public static void main(String[] args) {

        // MAKING OBJECTS AS REFERENCES TO THEIR RESPECTIVE (DIRECT OR INDIRECT) INTERFACES
//        I1 i1 = new I1();       // invalid because I1 is an interface and interfaces are abstract
        I1 i2 = new C1();       // valid through Dynamic Method Dispatch, because C1 is not abstract
        I1 i3 = new C2();       // valid through Dynamic Method Dispatch, because C2 is not abstract
        I1 i4 = new C3();       // valid through Dynamic Method Dispatch, because C3 is not abstract
        // note: above cases of DMD wouldn't've been valid if C1, C2 and C3 were not implementing I1

//        I2 i5 = new I2();       // invalid because I2 is an interface and interfaces are abstract
        I2 i6 = new C1();       // valid through Dynamic Method Dispatch, because C1 is not abstract
        I2 i7 = new C2();       // valid through Dynamic Method Dispatch, because C2 is not abstract
        I2 i8 = new C3();       // valid through Dynamic Method Dispatch, because C3 is not abstract
        // note: above cases of DMD wouldn't've been valid if C1, C2 and C3 were not implementing I2

//        I3 i9 = new I3();       // invalid because I3 is an interface and interfaces are abstract
//        I3 i10 = new C1();      // invalid because C1 doesn't implement I3 in any manner
//        I3 i11 = new C2();      // invalid because C2 doesn't implement I3 in any manner
        I3 i12 = new C3();      // valid through Dynamic Method Dispatch, because C3 is not abstract
        // note: above case of DMD was only valid because C3 has implemented I3
        // and the cases with i10 and i11 are not valid because C1 and C2 have not implemented I3

        // i2, i3 and i4 can only call methods of I1 because they've been defined as a reference to I1 only
        i2.methodI1();
        i3.methodI1();
        i4.methodI1();

        // i6, i7 and i8 can only call methods of I2 because they've been defined as a reference to I2 only
        i6.methodI2();
        i7.methodI2();
        i8.methodI2();

        // i12 can call methods of all three I1, I2 and I3, because I3 extended from I1 and I2
        // and hence inherited their methods, and i12 has been defined as a reference to I3
        i12.methodI1();
        i12.methodI2();
        i12.methodI3();

        // MAKING OBJECTS AS REFERENCES TO THEIR RESPECTIVE CLASSES OR (DIRECT OR INDIRECT) SUPERCLASSES
        C1 c1 = new C1();
        C1 c2 = new C2();       // valid through Dynamic Method Dispatch as C2 is derived from C1
        C1 c3 = new C3();       // valid through Dynamic Method Dispatch as C3 is indirectly derived from C1
//        C1 c4 = new I1();     // not valid as I1 is abstract
//        C1 c5 = new I2();     // not valid as I2 is abstract
//        C1 c6 = new I3();     // not valid as I3 is abstract
        // c1, c2, c3 all can only access methodI1() and methodI2() of C1
        // because C1 doesn't have a methodI3() and, c2 and c3 were made as a reference to superclass C1
        c1.methodI1();
        c1.methodI2();
        c2.methodI1();
        c2.methodI2();
        c3.methodI1();
        c3.methodI2();
//        c3.methodI3();        // not valid because C1 doesn't have a methodI3()

//        C2 c7 = new C1();     // invalid form of DMD
        C2 c8 = new C2();
        C2 c9 = new C3();       // valid through DMD as C3 is derived from C2
//        C2 c10 = new I1();    // not valid as I1 is abstract
//        C2 c11 = new I2();    // not valid as I2 is abstract
//        C2 c12 = new I3();    // not valid as I3 is abstract
        // c8 and c9 can only access methodI1() and methodI2() of C2 inherited from C1
        // because C2 (or C1) don't have a methodI3() and, c9 was made as a reference to superclass C2
        c8.methodI1();
        c8.methodI2();
        c9.methodI1();
        c9.methodI2();
//        c9.methodI3();        // not valid because C2 doesn't have a methodI3()

//        C3 c13 = new C1();    // invalid form of DMD
//        C3 c14 = new C2();    // invalid form of DMD
        C3 c15 = new C3();
//        C3 c16 = new I1();    // not valid as I1 is abstract
//        C3 c17 = new I2();    // not valid as I2 is abstract
//        C3 c18 = new I3();    // not valid as I3 is abstract
        // c15 can access all three methodI1(), methodI2() and methodI3()
        // because the class C3 has inherited methodI1() and methodI2() from C2 which inherited them from C1
        // and, C3 had a methodI3() of its own
        c15.methodI1();
        c15.methodI2();
        c15.methodI3();
    }
}
