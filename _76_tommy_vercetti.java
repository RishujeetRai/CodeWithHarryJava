class tommyVercetti{
    public void run(){
        System.out.println("Vercetti is running...");
    }
    public void fire(){
        System.out.println("DuDuDuDuDuDuDuDu...");
    }
    public void hit(){
        System.out.println("Tommy Vercetti is hitting...");
    }
    public void jump(){
        System.out.println("Tommy Vercetti is jumping...");
    }
}
public class _76_tommy_vercetti {
    public static void main(String[] args) {
        tommyVercetti T = new tommyVercetti();
        T.hit();
        T.run();
        T.jump();
        T.fire();
    }
}
