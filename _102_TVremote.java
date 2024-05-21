interface SmartTVremote{
    void connect();
    void disconnect();
}
interface TVremote extends SmartTVremote{
    void volUP();
    void volDOWN();
    void chUP();
    void chDOWN();
    void power();
}
class TV implements TVremote{
    public void volUP(){
        System.out.println("Volume up.");
    };
    public void volDOWN(){
        System.out.println("Volume down.");
    };
    public void chUP(){
        System.out.println("Channel up.");
    };
    public void chDOWN(){
        System.out.println("Channel down");
    };
    public void power(){
        System.out.println("Toggling power.");
    };
    public void connect(){
        System.out.println("Connecting to server.");
    };
    public void disconnect(){
        System.out.println("Disconnecting from server.");
    };
}
public class _102_TVremote {
    public static void main(String[] args) {
        TV t = new TV();
        t.power();
        t.connect();
        t.volUP();
        t.chUP();
        t.chDOWN();
        t.volDOWN();
        t.disconnect();
        t.power();
    }
}
