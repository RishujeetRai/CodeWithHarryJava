class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void call(){
        System.out.println("Calling...");
    }
    public void ignoreCall(){
        System.out.println("Ignoring call...");
    }
}
public class _73_class_cellphone {
    public static void main(String[] args) {
        cellphone c = new cellphone();
        c.ring();
        c.vibrate();
        c.call();
        c.ignoreCall();
    }
}
