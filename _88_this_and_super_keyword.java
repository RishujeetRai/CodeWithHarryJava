class xonex{
    int a;
    xonex(int a){
        this.a = a;     // this keyword is used to reference variables or methods of current class
        System.out.println("Base class' parametrized constructor called.");
    }
    public void geta(){
        System.out.println("Value of a is: "+a);
    }
}
/*
 most common use of this keyword is to eliminate the confusion bw class attributes and parameters the with same name
*/
class xderivedx extends xonex{
    xderivedx(){
        super(33);      // calling the parametrized constructor of base class xonex
        System.out.println("Default derived class' constructor called.");
    }
}
/*
 super is a reference variable used to refer immediate parent class object
 can be used to refer immediate parent class instance variable, or invoke parent class methods or constructors
*/
public class _88_this_and_super_keyword {
    public static void main(String[] args) {
        xderivedx X = new xderivedx();  // creating a xderivedx object using a default xderivedx constructor
        X.geta();   // calling a base class method using a derived class object
    }
}
