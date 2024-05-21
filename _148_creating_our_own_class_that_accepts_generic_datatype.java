// we can make our own class that accepts generic datatype as well, using the below syntax
class MyGeneric<Type1>{
    // MyGeneric is the name of class whose objects can be instantiated using any of the generic datatype
    // Type1 can take form of any of the generic datatype accepted by Java
    Type1 t1;   // since this is a class, we make class objects of Type1 generic datatype in this class as well
    MyGeneric(Type1 t){ // we can define a  constructor of MyGeneric class too
        // which will accept parameters of Type1 generic datatype
        // t will be the generic datatype that will be passed while calling this constructor
        t1 = t; // generic datatype t will be assigned to t1
    }
}

public class _148_creating_our_own_class_that_accepts_generic_datatype {
    public static void main(String[] args) {
        // instantiating objects of our class using different generic datatype
        MyGeneric<Integer> MG1 = new MyGeneric<>(2);    // 2 is the Integer value getting passed to MG1
        MyGeneric<String> MG2 = new MyGeneric<>("sad"); // "sad" is the String value getting passed to MG2
        MyGeneric<Double> MG3 = new MyGeneric<>(2.2);   // 2.2 is the Double value getting passed to MG3
        System.out.println(MG1.t1);
        System.out.println(MG2.t1);
        System.out.println(MG3.t1);
        // use of generic datatype while creating class is that we can define methods which are not limited to
        // a single type of data, same method can work with any type of generic datatype depending on which
        // type of generic datatype is getting passed between <> while instantiating objects of the class

        // we can pass more than one generic datatype as well to a class, and work accordingly with them
    }
}