class KeyPadPhone{
    @Deprecated     // this method is not deprecated
        // compiler will throw warning while compiling if we use this deprecated method now
    void sendMessage(){
        System.out.println("Text message sent!");
    }
}
@FunctionalInterface    // this annotation marks an interface as a functional interface
interface myInterface {     // a functional interface is an interface that has only one abstract method
    void method1();     // abstract method of this functional interface
//    void method2();   // can't put two abstract methods in a functional interface
// compiler would've thrown an error if we had put two abstract methods inside this functional interface
}
class AndroidPhone extends KeyPadPhone{
    @SuppressWarnings("deprecation")    // the warning about deprecation will be now suppressed
        // compiler will not throw any warning now during compiling
    @Override   // @override annotation to mark overriding of a method
        // help us to know if a method is getting overridden
        // compiler will error if mention this annotation and don't override a method right afterwards
    void sendMessage(){
        System.out.println("Message sent via WhatsApp!");
    }
}

public class _144_annotations_in_java {
    public static void main(String[] args) {
        AndroidPhone Samsung = new AndroidPhone();
        Samsung.sendMessage();
    }
}
