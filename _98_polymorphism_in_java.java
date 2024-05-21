interface Camera2{
    void takeSnap();
    void takeVideo();
    default void take4kVideo(){
        System.out.println("Recording in 4k...");
    };
}
interface WiFi2{
    void connect();
    void disconnect();
}
class ChadNokia2{
    void callNum(int n){
        System.out.println("Calling "+n+"...");
    }
    void pickCall(boolean b){
        if(b) System.out.println("Answering the call...");
        else System.out.println("Rejecting the call...");
    }
}
class Smartphone2 extends ChadNokia2 implements Camera2, WiFi2{
    public void takeSnap(){
        System.out.println("Taking a snap...");
    }
    public void takeVideo(){
        System.out.println("Taking a video...");
    }
    public void connect(){
        System.out.println("Connecting to WiFi...");
    }
    public void disconnect(){
        System.out.println("Disconnecting WiFi...");
    }
}
public class _98_polymorphism_in_java {
    public static void main(String[] args) {
        Camera2 C = new Smartphone2();  // giving a person a smartphone, but to only use it as a camera
        // C is an object of Smartphone made as a reference to interface Camera2
        C.takeSnap();       // good you are using it as a camera
        C.takeVideo();      // good you are using it as a camera
        C.take4kVideo();    // good you are using it as a camera

        // C.pickCall(true);   // ohhhhh, I gave you the phone to only use it as a camera,
        // why are you answering my calls

        // an object of a class made as a reference of the interface it is implementing
        // can only use the methods available in that interface

        // an object of a subclass made as a reference of the superclass it is derived from
        // can only use the methods present in that superclass

        // in case of any overriding, the overridden methods are called

        Smartphone S = new Smartphone();    // here Mr.PPBH, take my smartphone
        System.out.println("Oowee!");
        S.takeSnap();
        S.takeVideo();
        S.take4kVideo();
        S.connect();
        S.disconnect();
        S.callNum(24242424);
        S.pickCall(true);
    }
}
