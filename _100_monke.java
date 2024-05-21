class Monkey{
    void jump(){
        System.out.println("Jumping da yo...");
    }
    void bite(){
        System.out.println("Biting da yo...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    };
    public void sleep(){
        System.out.println("Sleeping...");
    };
    void read(){
        System.out.println("Reading...");
    }
}
public class _100_monke {
    public static void main(String[] args) {
        Human H = new Human();
        H.eat();
        H.sleep();
        H.bite();
        H.jump();
        H.read();
        Monkey M = new Human();     // insan ke bhes mein bandar
        M.bite();
        M.jump();
        // M.read();    // M is an object of Human but made as a reference of Monkey
        // so M can't use methods of Human that aren't in Monkey
    }
}
