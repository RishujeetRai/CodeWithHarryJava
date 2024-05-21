abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing...");
    }
    void refill(){
        System.out.println("Refilling...");
    }
    void changeNib(){
        System.out.println("Nae Nibba Nae Nae...");
    }
}
public class _99_pen_and_fountain_pen {
    public static void main(String[] args) {
        FountainPen F = new FountainPen();
        F.write();
        F.refill();
        F.changeNib();
    }
}
