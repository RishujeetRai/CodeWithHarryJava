// we define default methods in interfaces so we don't have to override them in the classes that implement them
// nevertheless we can still override them if we want
interface Camera{
    void takeSnap();
    void takeVideo();
    default void take4kVideo(){
        // the default methods should have a body
        System.out.println("Recording in 4k...");
    };
}
interface WiFi{
    void connect();
    void disconnect();
}
class ChadNokia{
    void callNum(int n){
        System.out.println("Calling "+n+"...");
    }
    void pickCall(boolean b){
        if(b) System.out.println("Answering the call...");
        else System.out.println("Rejecting the call...");
    }
}
class Smartphone extends ChadNokia implements Camera, WiFi{
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
public class _97_default_methods_in_interfaces {
    public static void main(String[] args) {
        Smartphone S = new Smartphone();
        S.takeSnap();
        S.takeVideo();
        S.take4kVideo();
        S.connect();
        S.disconnect();
        S.callNum(7277884);
        S.pickCall(true);
    }
}
